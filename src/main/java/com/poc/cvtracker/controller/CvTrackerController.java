package com.poc.cvtracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.poc.cvtracker.service.CvDataService;

@Controller
public class CvTrackerController {

	@Autowired
	CvDataService CvDataService;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("dataModelValue", CvDataService.getCvDataModel());
		return "home";
	}
}
