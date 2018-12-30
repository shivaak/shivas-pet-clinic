/**
 * 
 */
package com.learning.petclinic.services.map;

import java.util.Set;

import com.learning.petclinic.model.Owner;
import com.learning.petclinic.services.CrudService;
import com.learning.petclinic.services.OwnerService;

/**
 * @author shivaak on 27-Dec-2018
 *
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner obj) {
		return super.save(obj.getId(), obj);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Owner obj) {
		super.delete(obj);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.learning.petclinic.services.OwnerService#findByLastName(java.lang.String)
	 */
	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
