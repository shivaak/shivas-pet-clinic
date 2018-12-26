/**
 * 
 */
package com.learning.petclinic.services;

import java.util.Set;

import com.learning.petclinic.model.Vet;

/**
 * @author shivaak on 26-Dec-2018
 *
 */
public interface VetService {

	public Vet findById(Long Id);

	public Vet save(Vet vet);

	public Set<Vet> findAll();
}
