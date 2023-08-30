package com.formationkilo.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.formationkilo.dto.ModuleFormation;
import com.formationkilo.service.IModuleFormationService;

@Named
@ManagedBean
@Scope("session")
public class AddFormationModule {
	
	
	@Inject
	private ModuleFormation moduleFormation;
	
	public ModuleFormation getModuleFormation() {
		return moduleFormation;
	}


	public void setModuleFormation(ModuleFormation moduleFormation) {
		this.moduleFormation = moduleFormation;
	}


	@Inject
	private IModuleFormationService moduleFormationService;
	

   public IModuleFormationService getModuleFormationService() {
		return moduleFormationService;
	}


	public void setModuleFormationService(IModuleFormationService moduleFormationService) {
		this.moduleFormationService = moduleFormationService;
	}


    public String execute() {
	 String returnValue="success";
	 try {
		moduleFormationService.save(moduleFormation);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		returnValue="fail";
	}
	 return returnValue;
   }
	
		
}
