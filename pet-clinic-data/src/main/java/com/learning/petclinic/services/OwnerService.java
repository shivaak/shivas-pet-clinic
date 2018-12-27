/**
 * 
 */
package com.learning.petclinic.services;

import com.learning.petclinic.model.Owner;

/**
 * @author shivaak on 26-Dec-2018
 *
 */
public interface OwnerService extends CrudService<Owner, Long> {
	
	public Owner findByLastName(String lastName);
	
}
