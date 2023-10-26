package com.formationkilo.dao;

import org.hibernate.Session;

public abstract class MaClasseCentrale<T> {

	/**
	 * Create a hibernate session and atomic; make it available to the subclass for persistence.
	 * @param dto
	 * @throws Exception
	 */
	public void save(T dto)throws Exception {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//session.save(foo);
		insert(session, dto);
		session.getTransaction().commit();
	} 
	
	/**
	 * Allow a subclass to determine how to save this item.
	 * @param session
	 * @param dto
	 */
	public abstract  void insert(Session session, T dto) throws Exception;
}
