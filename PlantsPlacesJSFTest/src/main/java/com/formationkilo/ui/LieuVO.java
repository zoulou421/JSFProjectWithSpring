package com.formationkilo.ui;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import org.springframework.context.annotation.Scope;

import com.formationkilo.dto.Lieu;
import com.formationkilo.dto.ModuleFormation;
import com.formationkilo.service.IModuleFormationService;

@Named
@ManagedBean
@Scope("request")
public class LieuVO {

	final static Logger logger=Logger.getLogger(LieuVO.class);
	
	private ModuleFormation moduleFormation;

	@Inject
	private Lieu lieu;
	
	//@Inject
	//private IModuleFormationService moduleFormationService;
	@Inject
	private IModuleFormationService moduleFormationDAOStub;
	
	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public ModuleFormation getModuleFormation() {
		return moduleFormation;
	}

	public void setModuleFormation(ModuleFormation moduleFormation) {
		this.moduleFormation = moduleFormation;
	}
	
	public String record() {
		logger.info("Entering the Execute method");	
		 String returnValue="success";
		   //get faces context
		  FacesContext currentInstance=FacesContext.getCurrentInstance();
		//lieu.setModuleFormationId(moduleFormation.getGuid());
		//save
		//set the foreign key to the ModuleFormation id  before saving
		
	
			//save
		try {
			//lieu.setModuleFormationId(moduleFormation.getGuid());
			//moduleFormationService.save(lieu);
			//moduleFormationDAOStub.save(lieu);
			//moduleFormationDAOStub.save(lieu);
			lieu.setModuleFormationId(moduleFormation.getGuid());
			moduleFormationDAOStub.save(moduleFormation);
			logger.info("Save successful"+lieu.toString());
			
			
			FacesMessage fm= new FacesMessage(FacesMessage.SEVERITY_INFO, "saved", "Lieu saved");
			//display the message
			currentInstance.addMessage(null, fm);
			return "lieu saved";
		} catch (Exception e) {
			logger.error("Error while saving Lieu. Message:"+e.getMessage());
			e.printStackTrace();
			returnValue="fail";
			FacesMessage fm= new FacesMessage(FacesMessage.SEVERITY_ERROR, "Unable to save", "Lieu is not saved");
			//display the message
			currentInstance.addMessage(null, fm);
		}
		return returnValue;
	}
}