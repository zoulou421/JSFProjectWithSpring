package com.formationkilo.dao;

import java.util.Collections;
import java.util.List;

import javax.inject.Named;

import org.hibernate.Session;

import com.formationkilo.dto.Lieu;

/**
 * A hibernate persistence implementation of our LieuDAO 
 * @author Bonevy BEBY
 *
 */
@Named
//public class LieuHbmDAO implements ILieuDAO {
public class LieuHbmDAO extends ModuleFormationHbmDAO implements ILieuDAO {
// SpecimenHbmDAO extends PlantPlacesHbmDAO<Specimen> implements ISpecimenDAO
	public void insert(Lieu lieu) throws Exception{
		
		// Save the Lieu to the database
		
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.save(lieu);
				session.getTransaction().commit();
	}
	
	@Override
	public List<Lieu> fetchByModuleFormationId(int moduleFormationId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		// create the query
		org.hibernate.Query query = session.createQuery("from Lieu where moduleFormationId = :moduleFormationId");
		query.setParameter("moduleFormationId", moduleFormationId);
		// query.setProperties(plant);
		List list = query.list();
		
		List<Lieu> list_lieu = Collections.checkedList(list, Lieu.class);
		
		return list_lieu;
	}
}