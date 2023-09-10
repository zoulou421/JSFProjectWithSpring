package com.formationkilo.dao;

import java.util.List;

import org.hibernate.Session;

import com.formationkilo.dto.ModuleFormation;

public class ModuleFormationHbmDAO implements IModuleFormationDAO{

	@Override
	public List<ModuleFormation> fetchModuleFormations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(ModuleFormation mf) throws Exception {
		// Save the ModuleFormation to the database
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(mf);
		session.getTransaction().commit();
		
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
