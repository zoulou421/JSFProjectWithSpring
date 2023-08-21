package com.formationkilo.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.formationkilo.dao.IModuleFormationDAO;
import com.formationkilo.dto.ModuleFormation;

@Named
public class ModuleFormationServiceImpl implements IModuleFormationService {

	@Inject
	IModuleFormationDAO moduleFormationDAO;
	private List<ModuleFormation>allModuleFormations;
	@Override
	public List<ModuleFormation> filterModuleFormation(String filter) {
		//List<ModuleFormation>allModuleFormations= moduleFormationDAO.fetchModuleFormations();
		if(allModuleFormations ==null) {
			allModuleFormations=moduleFormationDAO.fetchModuleFormations();
		}
		//the collection we are returning
		List<ModuleFormation> returnModuleFormations = new ArrayList<ModuleFormation>();
		//filter the list
		//interview all possible ModuleFormations(allModuleFormations), and move ModuleFormation 
		//that contain the text into our subset collection(returnModuleFormations)
		for(ModuleFormation mf: allModuleFormations) {
			if(mf.toString().contains(filter)) {
				//this ModuleFormation matches our criteria, so add it to the collection 
				//that will be returned from this method.
				returnModuleFormations.add(mf);
			}
		}
		// TODO Auto-generated method stub
		return returnModuleFormations;
	}

}
 