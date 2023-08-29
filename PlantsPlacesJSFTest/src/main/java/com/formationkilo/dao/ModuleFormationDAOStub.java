package com.formationkilo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.formationkilo.dto.ModuleFormation;

@Named("moduleFormationImplDAO")
public class ModuleFormationDAOStub implements IModuleFormationDAO {

	@Override
	public List<ModuleFormation> fetchModuleFormations() {
		List<ModuleFormation>allModuleFormations=new ArrayList<ModuleFormation>();
		
		//create ModuleFormation and add them to the collection.
		ModuleFormation javamodule=new ModuleFormation();
		javamodule.setName("JavaServer Faces ");
		javamodule.setLangage("java");
		javamodule.setType("Aplication web");
		javamodule.setDescription("Formation bootcamp");
		javamodule.setLieu("Dakar");
		
		allModuleFormations.add(javamodule);
		
		ModuleFormation javasspboot=new ModuleFormation();
		javasspboot.setName("Java Spring boot ");
		javasspboot.setLangage("java");
		javasspboot.setType("Aplication web");
		javasspboot.setDescription("Formation bootcamp");
		javasspboot.setLieu("Dakar");
		
		allModuleFormations.add(javasspboot);
		
		
		ModuleFormation javasstructs=new ModuleFormation();
		javasstructs.setName("Java Structs 2 ");
		javasstructs.setLangage("java");
		javasstructs.setType("Aplication web");
		javasstructs.setDescription("Formation bootcamp");
		javasstructs.setLieu("Dakar");
		
		allModuleFormations.add(javasstructs);
		
		ModuleFormation javaspringmvc=new ModuleFormation();
		javaspringmvc.setName("Java SpringMVC ");
		javaspringmvc.setLangage("java");
		javaspringmvc.setType("Aplication web");
		javaspringmvc.setDescription("Formation bootcamp");
		javaspringmvc.setLieu("Dakar");
		
		allModuleFormations.add(javaspringmvc);
		
		ModuleFormation playfk=new ModuleFormation();
		playfk.setName("Java Play Framework ");
		
		playfk.setLangage("java");
		playfk.setType("Aplication web");
		playfk.setDescription("Formation bootcamp");
		playfk.setLieu("Dakar");
		allModuleFormations.add(playfk);
		
		return allModuleFormations;
	}

	@Override
	public void insert(ModuleFormation mf) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ModuleFormation mf) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ModuleFormation mf) throws Exception {
		// TODO Auto-generated method stub
		
	}

}