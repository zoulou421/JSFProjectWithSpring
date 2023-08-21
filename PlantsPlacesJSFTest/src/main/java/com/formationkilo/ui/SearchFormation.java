package com.formationkilo.ui;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<ModuleFormation>completeFormation(String query){
		ArrayList<ModuleFormation>allModuleFormations=new ArrayList<ModuleFormation>();
		//create ModuleFormation and add them to the collection.
		ModuleFormation javamodule=new ModuleFormation();
		javamodule.setName("JavaServer Faces ");
		allModuleFormations.add(javamodule);
		
		ModuleFormation javasspboot=new ModuleFormation();
		javasspboot.setName("Java Spring boot ");
		allModuleFormations.add(javasspboot);
		
		ModuleFormation javasstructs=new ModuleFormation();
		javasstructs.setName("Java Structs 2 ");
		allModuleFormations.add(javasstructs);
		
		ModuleFormation javaspringmvc=new ModuleFormation();
		javaspringmvc.setName("Java SpringMVC ");
		allModuleFormations.add(javaspringmvc);
		
		return allModuleFormations;
	}
	
}
