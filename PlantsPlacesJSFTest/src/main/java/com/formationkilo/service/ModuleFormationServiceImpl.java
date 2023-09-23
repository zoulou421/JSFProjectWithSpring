package com.formationkilo.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.formationkilo.dao.ILieuHbDAO;
import com.formationkilo.dao.IModuleFormationDAO;
import com.formationkilo.dto.LieuDTO;
import com.formationkilo.dto.ModuleFormation;


@Named
public class ModuleFormationServiceImpl implements IModuleFormationService {

	@Inject
	private IModuleFormationDAO moduleFormationDAOStub;
	
	//@Inject
	//private ILieuDAO lieuDAO;
	
	@Inject
	private ILieuHbDAO lieuHbDAO;
	
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
	


}
 