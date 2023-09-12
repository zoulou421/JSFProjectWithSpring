package com.formationkilo.dao;

import java.util.List;

import com.formationkilo.dto.ModuleFormation;

import junit.framework.TestCase;

public class TestModuleFormationHbmDAO extends TestCase {
	
	private IModuleFormationDAO moduleFormationHbmDAO;
	private List<ModuleFormation>moduleFormations;

 public void fetchByLieuName() {
	    givenModuleFormationDAOInstantiated();
		whenLieuNameIsDakar();
		thenVerifyResults();
 }

private void thenVerifyResults() {
	// TODO Auto-generated method stub
	assertTrue(moduleFormations.size()>0);
	for(ModuleFormation modf:moduleFormations) {
		assertEquals("dakar",modf.getLieu());
	}
	
}

private void whenLieuNameIsDakar() {
	// TODO Auto-generated method stub
	ModuleFormation mf= new ModuleFormation();
	mf.setLieu("dakar");
	moduleFormations=moduleFormationHbmDAO.fetchModuleFormations(mf);
	
}

private void givenModuleFormationDAOInstantiated() {
	// TODO Auto-generated method stub
	moduleFormationHbmDAO = new ModuleFormationHbmDAO();
	
}

}
