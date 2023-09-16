package com.formationkilo.ui;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.formationkilo.dto.ModuleFormation;
import com.formationkilo.service.IModuleFormationService;

@Named
@ManagedBean
@Scope("session")
public class SearchFormation {

	@Inject
	private ModuleFormation moduleFormation;
	
	@Inject
	private IModuleFormationService moduleFormationService;
	
	private List<ModuleFormation> collectionModuleFormation;
	public List<ModuleFormation> getCollectionModuleFormation() {
		return collectionModuleFormation;
	}

	public void setCollectionModuleFormation(List<ModuleFormation> collectionModuleFormation) {
		this.collectionModuleFormation = collectionModuleFormation;
	}

	public ModuleFormation getModuleFormation() {
		return moduleFormation;
	}

	public void setModuleFormation(ModuleFormation moduleFormation) {
		this.moduleFormation = moduleFormation;
	}
    /**
     * Handle button clicks from searches.
     * @return the next navigation.
     */
	public String execute() {
		 collectionModuleFormation = moduleFormationService.fetchModuleFormation(moduleFormation);
		
		//if(moduleFormation!=null && moduleFormation.getName().equalsIgnoreCase("JavaEE")) {
		if(collectionModuleFormation.size()>0) {
		 return "search";
		}else {
			return "noresults";
		}
	}
	
	public List<ModuleFormation>completeFormation(String query){
		//ArrayList<ModuleFormation>allModuleFormations=new ArrayList<ModuleFormation>();
		//create ModuleFormation and add them to the collection.
		/*ModuleFormation javamodule=new ModuleFormation();
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
		
		return allModuleFormations;*/
		return moduleFormationService.filterModuleFormation(query)	;	
		
	}
	
}
