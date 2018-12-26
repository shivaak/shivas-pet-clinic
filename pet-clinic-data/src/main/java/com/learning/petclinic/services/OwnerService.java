/**
 * 
 */
package com.learning.petclinic.services;

import java.util.Set;

import com.learning.petclinic.model.Owner;

/**
 * @author shivaak on 26-Dec-2018
 *
 */
public interface OwnerService {
	
	public Owner findByLastName(String lastName);
	
	public Owner findById(Long Id);
	
	public Owner save(Owner owner);
	
	public Set<Owner> findAll();
	
}
