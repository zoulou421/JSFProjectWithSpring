package com.formationkilo.ui.test;

import org.junit.Test;

import com.formationkilo.dto.ModuleFormation;
import com.formationkilo.ui.SearchFormation;

import junit.framework.TestCase;

public class TestSearchFormation extends TestCase{
	
	private SearchFormation searchFormation;
	private String execute;

	@Test
	public void testSearchFormationExecute() {
		//assertTrue(false);
		givenSearchFormationCreatedWithJavBud();
		whenInvokeExecute();
		thenVerifyReturnSuccess();
	
		
	}

	@Test
	public void testSearchFormationNoJavBud() {
		givenSearchFormationCreatedWithoutJavBud();
		whenInvokeExecute();
		thenVerifyReturnNoResults();
	}
	
	private void thenVerifyReturnNoResults() {
		// TODO Auto-generated method stub
		assertEquals("noresults",execute);
	}

	
	@Test
	public void testSearchFormationNull() {
		givenSearchFormationCreatedWithNullFormationModule();
		whenInvokeExecute();
		thenVerifyReturnNoResults();
	}
	private void givenSearchFormationCreatedWithNullFormationModule() {
		// TODO Auto-generated method stub
		searchFormation =new SearchFormation();
	}

	private void givenSearchFormationCreatedWithoutJavBud() {
		// TODO Auto-generated method stub
		searchFormation =new SearchFormation();
		ModuleFormation moduleFormation =new ModuleFormation();
		moduleFormation.setName("Java EJB");
		searchFormation.setModuleFormation(moduleFormation);
		
	}

	private void thenVerifyReturnSuccess() {
		// TODO Auto-generated method stub
		assertEquals("success", execute);
		
	}

	private void whenInvokeExecute() {
		// TODO Auto-generated method stub
		 execute = searchFormation.execute();
		
	}

	private void givenSearchFormationCreatedWithJavBud() {
		// TODO Auto-generated method stub
		searchFormation =new SearchFormation();
		ModuleFormation moduleFormation =new ModuleFormation();
		moduleFormation.setName("JavaBud");
		searchFormation.setModuleFormation(moduleFormation);
		
	}
}
