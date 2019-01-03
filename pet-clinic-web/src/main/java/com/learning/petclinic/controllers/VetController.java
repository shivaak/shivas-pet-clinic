/**
 * 
 */
package com.learning.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.petclinic.services.VetService;

/**
 * @author shivaak on 28-Dec-2018
 *
 */
@Controller
@RequestMapping("/vet")
public class VetController {

	VetService vetService;
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}


	@RequestMapping(value= {"","/","/index","/index.html"})
	public String showVetIndex(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vet/vetlist";
	}
}
