package com.formationkilo.dao;

import java.util.List;

import javax.inject.Named;

import org.hibernate.Session;

import com.formationkilo.dto.LieuDTO;
import com.formationkilo.dto.PhotoDTO;

@Named
public class PhotoHbmDAO extends MaClasseCentrale<PhotoDTO> implements IPhotoDAO  {

	@Override
	public void insert(Session session, PhotoDTO dto) throws Exception {
		// TODO Auto-generated method stub
		session.save(dto);
	}

	@Override
	public void save(PhotoDTO dto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PhotoDTO> fetchPhotos(LieuDTO lieuDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
