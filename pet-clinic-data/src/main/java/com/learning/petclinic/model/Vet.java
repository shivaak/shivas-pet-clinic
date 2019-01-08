/**
 * 
 */
package com.learning.petclinic.model;

import java.util.Set;

/**
 * @author shivaak on 26-Dec-2018
 *
 */
public class Vet extends Person {
	
	private static final long serialVersionUID = -7162127741902623243L;
	
	Set<Speciality> specialities;

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
	

}
