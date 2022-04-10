package com.dajava.webthuesanbong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dajava.webthuesanbong.models.SanBong;

import com.dajava.webthuesanbong.repositories.SanBongRepository;

@Service
public class SanBongService {
	@Autowired
	private SanBongRepository sanbongRepository;
	
	//hiển thị list KhuVuc
	public List<SanBong> getSanBong(){
		return sanbongRepository.findAll();
	}
	//new sanbong
	public void save(SanBong sanbong) {
		sanbongRepository.save(sanbong);
	}
}
