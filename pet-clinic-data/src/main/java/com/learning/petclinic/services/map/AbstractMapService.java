/**
 * 
 */
package com.learning.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.learning.petclinic.services.CrudService;

/**
 * @author shivaak on 27-Dec-2018
 * @param <T>
 *
 */
public abstract class AbstractMapService<T, ID> {


	protected Map<ID, T> map = new HashMap<>();
	
	public T findById(ID id) {
		return map.get(id);
	}

	public T save(ID id, T obj) {
		map.put(id, obj);
		return obj;
	}

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public void delete(T obj) {
		map.entrySet()
		   .removeIf(e -> e.getValue().equals(obj)); 
	}

	public void deleteById(ID id) {
		map.remove(id);
	}

}
