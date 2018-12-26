/**
 * 
 */
package com.learning.petclinic.model;

/**
 * @author shivaak on 26-Dec-2018
 *
 */
public class PetType extends BaseEntity {
	
	private static final long serialVersionUID = 5404510676819131692L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
