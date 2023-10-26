package com.formationkilo.dao;

import java.util.Collections;
import java.util.List;

import javax.inject.Named;

import org.hibernate.Query;
import org.hibernate.Session;


import com.formationkilo.dto.LieuDTO;
import com.formationkilo.dto.ModuleFormation;

@Named
public class LieuHbDAO extends MaClasseCentrale<LieuDTO> implements ILieuHbDAO {

//@Override
/*public void insert(LieuDTO lieuDTO) throws Exception{
		
		// Save the Lieu to the database
		
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.save(lieuDTO);
				session.getTransaction().commit();
				
			//	ref MaClasseCentrale
	}*/



//TO  ADD PICTURE
@Override
public List<LieuDTO>fetchByModuleFormationId(int idModuleFormation){
    Session session = HibernateUtil.getSessionFactory().openSession();
    Query query = session.createQuery("from LieuDTO where ForeignKeyModForId = :idModuleFormation");
	query.setParameter("idModuleFormation",idModuleFormation);
    @SuppressWarnings("rawtypes")
	List list= query.list();
    List<LieuDTO>list_lieu= Collections.checkedList(list, LieuDTO.class);
    return list_lieu;
	
}

/*@Override
public void insert(LieuDTO lieuDTO) throws Exception {
	// TODO Auto-generated method stub
	
}*/

@Override
public void insert(Session session, LieuDTO dto) throws Exception {
	session.save(dto);
	
}



}
