package com.dajava.webthuesanbong.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dajava.webthuesanbong.models.KhuVuc;
import com.dajava.webthuesanbong.services.KhuVucService;

@Controller
public class KhuVucController {
	
	@Autowired
	private KhuVucService khuvucService;
	
	@GetMapping("/khuvucs")
	public String getKhuVuc(Model model) {
		
		List<KhuVuc> khuvucList = khuvucService.getKhuVuc();
		
		
		model.addAttribute("khuvucs", khuvucList);
		return "khuvuc";
	}

}
