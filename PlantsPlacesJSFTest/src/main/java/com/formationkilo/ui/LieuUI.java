package com.formationkilo.ui;




import java.io.IOException;
import java.io.InputStream;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Session;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.UploadedFile;
import org.springframework.context.annotation.Scope;

import com.formationkilo.dto.LieuDTO;
import com.formationkilo.dto.ModuleFormation;
import com.formationkilo.dto.PhotoDTO;
import com.formationkilo.service.IModuleFormationService;

@Named
@ManagedBean
@Scope("session")
public class LieuUI {

	private ModuleFormation moduleFormation;
	
	@Inject
	private PhotoDTO photoDTO;
	
	@Inject
    private IModuleFormationService moduleFormationService;
	

	@Inject
	private LieuDTO lieuDTO;
	
	private UploadedFile file;
	
	public LieuDTO getLieuDTO() {
		return lieuDTO;
	}

	public void setLieuDTO(LieuDTO lieuDTO) {
		this.lieuDTO = lieuDTO;
	}

	public ModuleFormation getModuleFormation() {
		return moduleFormation;
	}

	
	
	public PhotoDTO getPhotoDTO() {
		return photoDTO;
	}

	public void setPhotoDTO(PhotoDTO photoDTO) {
		this.photoDTO = photoDTO;
	}

	public void setModuleFormation(ModuleFormation moduleFormation) {
		this.moduleFormation = moduleFormation;
		//add picture
		loadLieux();
		//fin add pic
	}
	//add pic
	private void loadLieux() {
		// TODO Auto-generated method stub
		moduleFormationService.loadLieux(moduleFormation);
	}
	//fin add pic

	public String saveLieu(Session session) {
		
		//set the foreign key to the ModuleFormation id  before saving
		lieuDTO.setForeignKeyModForId(moduleFormation.getGuid());
		try {
			moduleFormationService.saveLieu(session, lieuDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Lieu saved successfully!!!";
	}
	
       public void onRowSelect(SelectEvent event) {
		
    	   LieuDTO LieuDTOOnRowSelect=((LieuDTO) event.getObject());
		//push the selected plant into lieuDTO
		//lieuVO.setModuleFormation(modForOnRowSelect);
    	   setLieuDTO(LieuDTOOnRowSelect);
		
    }
       
      

       
    public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public void upload() throws Exception {
		 if(lieuDTO.getId()==0) {
  		   FacesMessage message = new FacesMessage("Vous n avez pas encore selectionné un lieu. SVP veuillez selectionner avec de mettre une image.");
	               FacesContext.getCurrentInstance().addMessage(null, message);
  	     }else if (file != null) {
        	   try {
				InputStream inputStream = file.getInputstream();
				//PhotoDTO photoDTO = new PhotoDTO();
				//set the lieuDTO  id
				photoDTO.setForeignKeyLieuId(lieuDTO.getId());
				//place a photo and a photo metadata to our business logic layer.
				moduleFormationService.savePhoto(photoDTO, inputStream) ;
				
				FacesMessage message = new FacesMessage("Successful", file.getFileName() + " is uploaded.");
	            FacesContext.getCurrentInstance().addMessage(null, message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				FacesMessage message = new FacesMessage("There is a problem, your file is not uploaded.");
	            FacesContext.getCurrentInstance().addMessage(null, message);
			  }
               
           }
       }
}

