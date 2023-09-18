package com.formationkilo.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.formationkilo.dto.ModuleFormation;

@Named
@ManagedBean
@Scope("session")
public class LieuVO {

	ModuleFormation moduleFormation;

	public ModuleFormation getModuleFormation() {
		return moduleFormation;
	}

	public void setModuleFormation(ModuleFormation moduleFormation) {
		this.moduleFormation = moduleFormation;
	}
}
