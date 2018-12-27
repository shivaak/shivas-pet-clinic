/**
 * 
 */
package com.learning.petclinic.services;

import java.util.Set;

/**
 * @author shivaak on 27-Dec-2018
 *
 */
public interface CrudService<T, ID> {

	public T findById(ID id);
	
	public T save(T obj);
	
	public Set<T> findAll();
	
	public void delete(T obj);
	
	public void deleteById(ID id);
}
