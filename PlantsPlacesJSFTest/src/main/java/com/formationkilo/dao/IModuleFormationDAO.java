package com.formationkilo.dao;

import java.util.List;

import com.formationkilo.dto.ModuleFormation;

public interface IModuleFormationDAO {

	public List<ModuleFormation>fetchModuleFormations();
	
	public void insert(ModuleFormation mf) throws Exception;
	public void update(ModuleFormation mf) throws Exception;
	public void delete(ModuleFormation mf) throws Exception;

	public List<ModuleFormation> fetchModuleFormations(ModuleFormation moduleFormation);
	
}