package com.dajava.webthuesanbong.controllers;

import java.util.List;
import java.util.Optional;

import com.dajava.webthuesanbong.models.SanBong;
import com.dajava.webthuesanbong.repositories.KhuVucRepository;
import com.dajava.webthuesanbong.services.SanBongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.dajava.webthuesanbong.models.KhuVuc;
import com.dajava.webthuesanbong.services.KhuVucService;

@Controller

public class KhuVucController {

	@Autowired
	private KhuVucService khuvucService;


	@GetMapping(value = "/khuvucs")
	public String getKhuVuc(Model model) {

		List<KhuVuc> khuvucList = khuvucService.getKhuVuc();
		model.addAttribute("khuvucs", khuvucList);
		return "khuvuc";
	}

	@PostMapping("/khuvucs/addNew")
	public String addNew(@ModelAttribute KhuVuc khuVuc){
        khuvucService.save(khuVuc);
		return "redirect:/khuvucs";
	}

	//
	@RequestMapping("khuvucs/findById")
	@ResponseBody
	public Optional<KhuVuc> findById(int id) {
		return khuvucService.findById(id);
	}
	//	//update san
	@RequestMapping(value="/khuvucs/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(KhuVuc khuvuc) {
		khuvucService.save(khuvuc);
		return "redirect:/khuvucs";
	}
	//delete
	@RequestMapping(value="/khuvuc/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(int id) {
		khuvucService.delete(id);
		return "redirect:/khuvucs";
	}

}
