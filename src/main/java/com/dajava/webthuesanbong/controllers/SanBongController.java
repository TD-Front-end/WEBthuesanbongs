package com.dajava.webthuesanbong.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	//
	@RequestMapping("sanbongs/findById")
	@ResponseBody
	public Optional<SanBong> findById(int maSan) {
		return sanbongService.findById(maSan);
	}
	//update
	@RequestMapping(value="/sanbongs/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(SanBong sanbong) {
		sanbongService.save(sanbong);
		return "redirect:/sanbongs";
	}
}
