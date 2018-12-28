/**
 * 
 */
package com.learning.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shivaak on 28-Dec-2018
 *
 */
@Controller
@RequestMapping("/vet")
public class VetController {

	@RequestMapping(value= {"","/","/index","/index.html"})
	public String showVetIndex() {
		return "vet/vetlist";
	}
}
