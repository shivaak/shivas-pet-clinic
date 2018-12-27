/**
 * 
 */
package com.learning.petclinic.services.map;

import java.util.Set;

import com.learning.petclinic.model.Vet;
import com.learning.petclinic.services.CrudService;

/**
 * @author shivaak on 27-Dec-2018
 *
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet obj) {
		return super.save(obj.getId(), obj);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Vet obj) {
		super.delete(obj);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
