package com.formationkilo.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.formationkilo.dto.Lieu;
import com.formationkilo.dto.ModuleFormation;
import com.formationkilo.service.IModuleFormationService;

@Named
@ManagedBean
@Scope("request")
public class LieuVO {

	private ModuleFormation moduleFormation;

	@Inject
	private Lieu lieu;
	
	@Inject
	private IModuleFormationService moduleFormationService;
	//private IModuleFormationService moduleFormationDAOStub;
	
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
	
	public String save() {
		//set the foreign key to the ModuleFormation id  before saving
		lieu.setModuleFormationId(moduleFormation.getGuid());
		//save
		try {
			moduleFormationService.save(lieu);
			return "lieu saved";
		} catch (Exception e) {
			
			e.printStackTrace();
			return "lieu failed to save";
		}
		
	}
}
