package com.formationkilo.dao;

import javax.inject.Named;

import org.hibernate.Session;

import com.formationkilo.dto.Lieu;

/**
 * A hibernate persistence implementation of our LieuDAO 
 * @author Bonevy BEBY
 *
 */
@Named
public class LieuHbmDAO implements ILieuDAO {

	public void insert(Lieu lieu) throws Exception{
		
		// Save the Lieu to the database
		
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.save(lieu);
				session.getTransaction().commit();
	}
}
