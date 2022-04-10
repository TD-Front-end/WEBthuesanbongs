package com.dajava.webthuesanbong.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dajava.webthuesanbong.models.ChuSan;

@Repository
public interface ChuSanRepository extends JpaRepository<ChuSan, Integer>{
	
	

}
