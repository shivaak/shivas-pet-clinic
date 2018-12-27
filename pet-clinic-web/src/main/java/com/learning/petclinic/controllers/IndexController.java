/**
 * 
 */
package com.learning.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shivaak on 27-Dec-2018
 *
 */
@Controller
public class IndexController {

	@RequestMapping(value= {"","/","index","index.html"})
	public String index() {
		return "index";
	}
}
