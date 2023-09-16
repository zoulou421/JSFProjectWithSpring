package com.formationkilo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.formationkilo.dto.ModuleFormation;

public class ModuleFormationHbmDAO implements IModuleFormationDAO{

	@Override
	public List<ModuleFormation> fetchModuleFormations() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from ModuleFormation");
        List list= query.list();
        List<ModuleFormation>list_moduleFormation= Collections.checkedList(list, ModuleFormation.class);
        return list_moduleFormation;
	}

	@Override
	public List<ModuleFormation> fetchModuleFormations(ModuleFormation moduleFormation) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		//create a query
				//Query query = session.createQuery("from ModuleFormation where lieu = :lieu");
		        Query query = session.createQuery("from ModuleFormation where lieu like :lieu");
				//query.setParameter("lieu", "Java");
				query.setParameter("lieu", "%" +moduleFormation.getLieu()+ "%");
				//query.setProperties(moduleFormation);
		       List list= query.list();
		//return new ArrayList<ModuleFormation>();
		        List<ModuleFormation>list_moduleFormation= Collections.checkedList(list, ModuleFormation.class);
		        return list_moduleFormation;
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
