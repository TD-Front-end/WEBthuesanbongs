package com.dajava.webthuesanbong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dajava.webthuesanbong.models.KhuVuc;
import com.dajava.webthuesanbong.repositories.KhuVucRepository;

@Service
public class KhuVucService {
	
	@Autowired
	private KhuVucRepository khuvucRepository;
	
	//hiển thị list KhuVuc
	public List<KhuVuc> getKhuVuc(){
		return khuvucRepository.findAll();
	}

}
