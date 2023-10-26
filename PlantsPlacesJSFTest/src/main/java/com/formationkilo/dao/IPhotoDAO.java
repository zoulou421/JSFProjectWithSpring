package com.formationkilo.dao;

import java.util.List;

import org.hibernate.Session;

import com.formationkilo.dto.LieuDTO;
import com.formationkilo.dto.PhotoDTO;

public interface IPhotoDAO {


	void insert(Session session, PhotoDTO dto) throws Exception;
	public void save(PhotoDTO dto) throws Exception;
	List<PhotoDTO> fetchPhotos(LieuDTO lieuDTO);
}
