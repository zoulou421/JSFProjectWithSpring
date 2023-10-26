package com.formationkilo.dao;

import java.util.List;

import org.hibernate.Session;

import com.formationkilo.dto.ModuleFormation;

public interface IModuleFormationDAO {

	public List<ModuleFormation>fetchModuleFormations();
	//public void insert( ModuleFormation mf) throws Exception;  ref MaClasseCentrale
	public void insert(Session session,ModuleFormation mf) throws Exception;
	public void update(ModuleFormation mf) throws Exception;
	public void delete(ModuleFormation mf) throws Exception;
	void save(ModuleFormation mf) throws Exception;
	public List<ModuleFormation> fetchModuleFormations(ModuleFormation moduleFormation);
	
}