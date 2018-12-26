/**
 * 
 */
package com.learning.petclinic.services;

import java.util.Set;

import com.learning.petclinic.model.Pet;

/**
 * @author shivaak on 26-Dec-2018
 *
 */
public interface PetService {

	public Pet findById(Long Id);

	public Pet save(Pet pet);

	public Set<Pet> findAll();
}
