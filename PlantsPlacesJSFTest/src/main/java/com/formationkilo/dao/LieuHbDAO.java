package com.formationkilo.dao;

import javax.inject.Named;

import org.hibernate.Session;


import com.formationkilo.dto.LieuDTO;

@Named
public class LieuHbDAO implements ILieuHbDAO {

@Override
public void insert(LieuDTO lieuDTO) throws Exception{
		
		// Save the Lieu to the database
		
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.save(lieuDTO);
				session.getTransaction().commit();
	}
}
