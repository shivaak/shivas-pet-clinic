/**
 * 
 */
package com.learning.petclinic.model;

/**
 * @author shivaak on 26-Dec-2018
 *
 */
public class Person extends BaseEntity {
	
	private static final long serialVersionUID = -7399489948892356263L;
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
