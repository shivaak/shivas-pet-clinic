/**
 * 
 */
package com.learning.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.petclinic.services.OwnerService;

/**
 * @author shivaak on 28-Dec-2018
 *
 */
@Controller
@RequestMapping("/owner")
public class OwnerController {

	OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}



	@RequestMapping(value= {"","/","/index","/index.html"})
	public String showOwnerIndex(Model model) {

		model.addAttribute("owners", ownerService.findAll());
		System.out.println(ownerService.findAll());
		return "owner/ownerlist";
	}
}
