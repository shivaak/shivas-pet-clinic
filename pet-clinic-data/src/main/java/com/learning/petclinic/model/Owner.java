/**
 * 
 */
package com.learning.petclinic.model;

import java.util.Set;

/**
 * @author shivaak on 26-Dec-2018
 *
 */
public class Owner extends Person{

	private static final long serialVersionUID = -3202557158487199299L;
	
	private Set<Pet> pets;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	

}
