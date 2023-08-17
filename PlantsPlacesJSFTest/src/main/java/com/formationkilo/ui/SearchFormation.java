package com.formationkilo.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.formationkilo.dto.ModuleFormation;

@Named
@ManagedBean
@Scope("session")
public class SearchFormation {

	@Inject
	private ModuleFormation moduleFormation;
	
	public ModuleFormation getModuleFormation() {
		return moduleFormation;
	}

	public void setModuleFormation(ModuleFormation moduleFormation) {
		this.moduleFormation = moduleFormation;
	}

	public String execute() {
		if(moduleFormation!=null && moduleFormation.getName().equalsIgnoreCase("JavaEE")) {
			return "search";
		}else {
			return "noresults";
		}
	}
}
