package com.dajava.webthuesanbong.controllers;

import java.util.List;
import java.util.Optional;

import com.dajava.webthuesanbong.models.KhuVuc;
import com.dajava.webthuesanbong.services.KhuVucService;
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
	@Autowired private SanBongService sanbongService;
//	@Autowired private KhuVucService khuvucService;
	
	@GetMapping("/sanbongs")
	public String getSanBong(Model model) {
		//
		List<SanBong> sanbongList = sanbongService.getSanBong();
		model.addAttribute("sanbongs", sanbongList);

//		List<KhuVuc> khuvucList = khuvucService.getKhuVuc();
//		model.addAttribute("khuvucs", khuvucList);
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
	public Optional<SanBong> findById(int id) {
		return sanbongService.findById(id);
	}
//	//update san
	@RequestMapping(value="/sanbongs/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(SanBong sanbong) {
		sanbongService.save(sanbong);
		return "redirect:/sanbongs";
	}
	//delete
	@RequestMapping(value="/sanbongs/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(int id) {
		sanbongService.delete(id);
		return "redirect:/sanbongs";
	}
}
