package com.dajava.webthuesanbong.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dajava.webthuesanbong.models.SanBong;
import com.dajava.webthuesanbong.services.SanBongService;

@Controller
public class SanBongController {
	@Autowired
	private SanBongService sanbongService;
	
	@GetMapping("/sanbongs")
	public String getSanBong(Model model) {
		
		List<SanBong> sanbongList = sanbongService.getSanBong();
		
		model.addAttribute("sanbongs", sanbongList);
		return "sanbong";
	}
	//add new sanbong
	@PostMapping("/sanbongs/addNew")
	public String addNew(SanBong sanbong) {
		sanbongService.save(sanbong);
		return "redirect:/sanbongs";
	}
}
