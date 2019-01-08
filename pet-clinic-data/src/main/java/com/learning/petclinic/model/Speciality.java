/**
 * 
 */
package com.learning.petclinic.model;

/**
 * @author shivaak on 08-Jan-2019
 *
 */
public class Speciality extends BaseEntity {
	
	private static final long serialVersionUID = 8244601674983368235L;
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
