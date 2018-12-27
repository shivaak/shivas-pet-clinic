/**
 * 
 */
package com.learning.petclinic.model;

import java.io.Serializable;

/**
 * @author shivaak on 26-Dec-2018
 *
 */
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1840106233810977103L;
	
	private Long Id;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
	
	
}
