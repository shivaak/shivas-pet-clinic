/**
 * 
 */
package com.learning.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.learning.petclinic.model.BaseEntity;

/**
 * @author shivaak on 27-Dec-2018
 * @param <T>
 *
 */
public abstract class AbstractMapService<T extends BaseEntity> {


	protected Map<Long, T> map = new HashMap<>();

	public T findById(Long id) {
		return map.get(id);
	}

	public T save(T obj) {
		Objects.requireNonNull(obj, "Object cannot be null");

		if (obj.getId() == null) {
			obj.setId(getNextId());
		}

		map.put(obj.getId(), obj);
		return obj;
	}

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public void delete(T obj) {
		map.entrySet()
		.removeIf(e -> e.getValue().equals(obj)); 
	}

	public void deleteById(Long id) {
		map.remove(id);
	}

	private Long getNextId() {
		Long currentKey = map.keySet().stream()
				.max(Long::compare)
				.orElse(0L);

		return currentKey + 1;
	}
}
