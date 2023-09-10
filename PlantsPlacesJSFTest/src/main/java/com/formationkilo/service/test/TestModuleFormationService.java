package com.formationkilo.service.test;



import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.formationkilo.dao.IModuleFormationDAO;
import com.formationkilo.dto.ModuleFormation;
import com.formationkilo.service.ModuleFormationServiceImpl;

import junit.framework.TestCase;

public class TestModuleFormationService extends TestCase{
	
	private ModuleFormationServiceImpl moduleFormationService;
	private List<ModuleFormation> filterModuleFormations;
	
	@Test
	public void testFilterModuleFormation() {
		//assertTrue(false);
		givenThatModuleFormationServiceIsPopulatedWithModuleFormationDAO();
		whenFilterWithJava();
		thenVerifyTwoResults();
		
	}

	private void thenVerifyTwoResults() {
		// TODO Auto-generated method stub
		assertEquals(2,filterModuleFormations.size());
	}

	private void whenFilterWithJava() {
		// TODO Auto-generated method stub
		filterModuleFormations= moduleFormationService.filterModuleFormation("Jav");
		
	}

	private void givenThatModuleFormationServiceIsPopulatedWithModuleFormationDAO() {
	   moduleFormationService = new ModuleFormationServiceImpl();
	   //a mock object is a shell of an object that will do whatever we want.
	   IModuleFormationDAO moduleFormationDAO= mock(IModuleFormationDAO.class);
	   // a known set of hardcoded moduleFormations
	   List<ModuleFormation>moduleFormationList= contructModuleFormationsList();
	   
	   //tell the mock object to return our known set of hardcoded,when requested
	   when(moduleFormationDAO.fetchModuleFormations()).thenReturn(moduleFormationList);
	   
	   //associate the mock object with the object we are testing
	   //moduleFormationService.setModFormationDAO(moduleFormationDAO);
	}
	
	   public List<ModuleFormation> contructModuleFormationsList() {
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

	
}

