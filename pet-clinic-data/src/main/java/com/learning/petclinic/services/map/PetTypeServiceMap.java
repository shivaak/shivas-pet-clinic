/**
 * 
 */
package com.learning.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.learning.petclinic.model.PetType;
import com.learning.petclinic.services.PetTypeService;

/**
 * @author shivaak on 08-Jan-2019
 *
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType> implements PetTypeService{
	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}

	@Override
	public PetType save(PetType obj) {
		return super.save(obj);
	}

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(PetType obj) {
		super.delete(obj);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
