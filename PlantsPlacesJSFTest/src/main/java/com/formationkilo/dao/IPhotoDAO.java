package com.formationkilo.dao;

import java.util.List;

import org.hibernate.Session;

import com.formationkilo.dto.LieuDTO;
import com.formationkilo.dto.Photo;

public interface IPhotoDAO {

	void insert(Session session, Photo dto) throws Exception;
	public void save(Photo dto) throws Exception;
	List<Photo> fetchPhotos(LieuDTO lieuDTO);
}
