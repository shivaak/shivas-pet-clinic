/**
 * 
 */
package com.learning.petclinic.services.map;

import java.util.Set;

import com.learning.petclinic.model.Pet;
import com.learning.petclinic.services.CrudService;

/**
 * @author shivaak on 27-Dec-2018
 *
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet obj) {
		return super.save(obj.getId(), obj);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Pet obj) {
		super.delete(obj);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}