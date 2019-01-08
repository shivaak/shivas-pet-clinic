/**
 * 
 */
package com.learning.petclinic.model;

import java.time.LocalDate;

/**
 * @author shivaak on 08-Jan-2019
 *
 */
public class Visit extends BaseEntity {
	
	private static final long serialVersionUID = -8657447269932026543L;
	
	
	private LocalDate date;
	private String description;
	private Pet pet;
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	

}
