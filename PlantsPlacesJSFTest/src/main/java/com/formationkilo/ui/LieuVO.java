package com.formationkilo.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.formationkilo.dto.Lieu;
import com.formationkilo.dto.ModuleFormation;

@Named
@ManagedBean
@Scope("session")
public class LieuVO {

	ModuleFormation moduleFormation;

	@Inject
	private Lieu lieu;
	
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
		int i=1+1;
		return "lieu saved";
	}
}
