package com.formationkilo.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.formationkilo.dao.IFileDAO;
import com.formationkilo.dao.ILieuHbDAO;
import com.formationkilo.dao.IModuleFormationDAO;
import com.formationkilo.dto.LieuDTO;
import com.formationkilo.dto.ModuleFormation;
import com.formationkilo.dto.PhotoDTO;


@Named
public class ModuleFormationServiceImpl implements IModuleFormationService {

	@Inject
	private IModuleFormationDAO moduleFormationDAOStub;
	
	//@Inject
	//private ILieuDAO lieuDAO;
	
	@Inject
	private ILieuHbDAO lieuHbDAO;
	
	@Inject
	private IFileDAO fileDAO;
	
	@Inject
	private PhotoDTO photoDTO;
	
	public IModuleFormationDAO getModuleFormationDAOStub() {
		return moduleFormationDAOStub;
	}
	public void setModuleFormationDAOStub(IModuleFormationDAO moduleFormationDAOStub) {
		this.moduleFormationDAOStub = moduleFormationDAOStub;
	}
	public List<ModuleFormation> getAllModuleFormations() {
		return allModuleFormations;
	}
	public void setAllModuleFormations(List<ModuleFormation> allModuleFormations) {
		this.allModuleFormations = allModuleFormations;
	}
	private List<ModuleFormation>allModuleFormations;
	
	
	@Override
	public List<ModuleFormation> filterModuleFormation(String filter) {
		//List<ModuleFormation>allModuleFormations= moduleFormationDAO.fetchModuleFormations();
		if(allModuleFormations ==null) {
			allModuleFormations=moduleFormationDAOStub.fetchModuleFormations();
		}
		//the collection we are returning
		List<ModuleFormation> returnModuleFormations = new ArrayList<ModuleFormation>();
		//filter the list
		//interview all possible ModuleFormations(allModuleFormations), and move ModuleFormation 
		//that contain the text into our subset collection(returnModuleFormations)
		for(ModuleFormation mf: allModuleFormations) {
			if(mf.toString().contains(filter)) {
				//this ModuleFormation matches our criteria, so add it to the collection 
				//that will be returned from this method.
				returnModuleFormations.add(mf);
			}
		}
		return returnModuleFormations;
	}
	
	public void save(ModuleFormation moduleFormation) throws Exception {
		
		   if(moduleFormation.getType()==null || moduleFormation.getType().isEmpty()) {
			   throw new Exception("Type est requis");
		   }
		   moduleFormationDAOStub.insert(moduleFormation);
		
	}
	/**
	 * Return a list of ModuleFormation that match the given criteria search
	 * @param moduleFormation a parameter that contains the search criteria
	 * @return
	 */
	@Override
	public List<ModuleFormation>fetchModuleFormation(ModuleFormation moduleFormation){
		//List<ModuleFormation> results= new ArrayList<ModuleFormation>();
		List<ModuleFormation> list_moduleFormation= moduleFormationDAOStub.fetchModuleFormations(moduleFormation);
		return list_moduleFormation;
		
	}
	
	@Override
	public void saveLieu(LieuDTO lieuDTO)throws Exception{
		lieuHbDAO.insert(lieuDTO);
	}
	
	//Add a picture
	@Override
	public void loadLieux(ModuleFormation moduleFormation) {
		// TODO Auto-generated method stub
		List<LieuDTO> lieux = lieuHbDAO.fetchByModuleFormationId(moduleFormation.getGuid());
		moduleFormation.setList_lieuDTO(lieux);
		
	}
	
	public void savePhoto(PhotoDTO photoDTO, InputStream inputStream) throws IOException{
		//File directory= new File("/pictures_appjsf");/PlantsPlacesJSFTest/src/main/webapp/images
		//C:\Users\HP\git\repository3\PlantsPlacesJSFTest\src\main\webapp\images
		File directory= new File("/pictures_appjsf");
		//File file= new File(directory,"p1_n.jpg");
		String uniqueImageName= getUniqueImageName();
		File file= new File(directory,uniqueImageName);
		fileDAO.save(inputStream, file);
		
		//photoDTO.setUri(file.toString());
		photoDTO.setUri(uniqueImageName);
		
		//eventually save photo to the database
	}
	
	private String getUniqueImageName() {
		// TODO Auto-generated method stub
		String imagePrefix="greenApp";
		String imagePreSuffix=".jpg";
		String middle="";
		SimpleDateFormat sdf=new SimpleDateFormat("yyMMddHHmmss");
		middle=sdf.format(new Date());
		return imagePrefix + middle + imagePreSuffix;
	}
	
	

}
 