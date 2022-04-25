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

	@GetMapping("/khuvucs/edit")
	@ResponseBody
	public Object edit(Integer id){

		return khuvucService.findById(id);
	}
	@PostMapping("/khuvuc/edit")
	public String edit(KhuVuc khuVuc){
        khuvucService.save(khuVuc);
		return "redirect:/khuvucs";
	}

    @GetMapping("/khuvucs/delete")
    public String create(@RequestParam("id") int id){
        khuvucService.delete(id);
        return "redirect:/khuvucs";
    }

}
