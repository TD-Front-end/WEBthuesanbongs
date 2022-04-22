package com.dajava.webthuesanbong.controllers;

import java.util.List;

import com.dajava.webthuesanbong.repositories.KhuVucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.dajava.webthuesanbong.models.KhuVuc;
import com.dajava.webthuesanbong.services.KhuVucService;

@Controller
@RequestMapping("/admin")
public class KhuVucController {

//	@Autowired
//	private KhuVucService khuvucService;
//	@Autowired
//	private KhuVucRepository khuVucRepository;

//	@GetMapping(value = "/khuvuc/main")
//	public String getKhuVuc(Model model) {
//
//		List<KhuVuc> khuvucList = khuvucService.getKhuVuc();
//		model.addAttribute("khuvucs", khuvucList);
//		return "admin/khuvuc";
//	}
//
//	@PostMapping("/khuvuc/create")
//	public String create(@ModelAttribute KhuVuc khuVuc){
//		khuVucRepository.save(khuVuc);
//		return "redirect:/admin/khuvuc/main";
//	}
//
//	@GetMapping("/khuvuc/delete")
//	public String create(@RequestParam("id") int id){
//		khuVucRepository.deleteById(id);
//		return "redirect:/admin/khuvuc/main";
//	}
//	@GetMapping("/khuvuc/edit")
//	@ResponseBody
//	public Object edit(Integer id){
//
//		return khuVucRepository.findById(id);
//	}
//	@PostMapping("/khuvuc/edit")
//	public String edit(KhuVuc khuVuc){
//		khuVucRepository.save(khuVuc);
//		return "redirect:/admin/khuvuc/main";
//	}

}
