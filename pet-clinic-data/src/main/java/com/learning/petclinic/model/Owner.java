/**
 * 
 */
package com.learning.petclinic.model;

import java.util.Set;

/**
 * @author shivaak on 26-Dec-2018
 *
 */
public class Owner extends Person{

	private static final long serialVersionUID = -3202557158487199299L;

	private Set<Pet> pets;

	private String address;

	private String city;

	private String phone;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}





}
