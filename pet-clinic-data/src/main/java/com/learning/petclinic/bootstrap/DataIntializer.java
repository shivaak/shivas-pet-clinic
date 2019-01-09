/**
 * 
 */
package com.learning.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.petclinic.model.Owner;
import com.learning.petclinic.model.PetType;
import com.learning.petclinic.model.Vet;
import com.learning.petclinic.services.OwnerService;
import com.learning.petclinic.services.PetTypeService;
import com.learning.petclinic.services.VetService;
import com.learning.petclinic.services.map.OwnerServiceMap;
import com.learning.petclinic.services.map.VetServiceMap;

/**
 * @author shivaak on 30-Dec-2018
 *
 */
@Component
public class DataIntializer implements CommandLineRunner {

	private OwnerService ownerService;
	
	private VetService vetService;
	
	private PetTypeService petTypeService;
	
	public DataIntializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bootstraping Data...");
		
		PetType dog = new PetType();
		dog.setName("dog");
		dog = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("dog");
		cat = petTypeService.save(cat);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Muruga");
		owner1.setLastName("God");
		owner1.setAddress("Adhi selva ganapathi st");
		owner1.setCity("Salem");
		owner1.setPhone("123456");
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Shiva");
		owner2.setLastName("Krishnan");
		owner2.setAddress("Ammapet");
		owner2.setCity("Tamilnadu");
		owner2.setPhone("789456");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Shankar");
		vet1.setLastName("Perumal");
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Vaidhiya");
		vet2.setLastName("Nadhan");
		
		ownerService.save(owner1);
		ownerService.save(owner2);
		
		vetService.save(vet1);
		vetService.save(vet2);
		
		System.out.println("Completed Loading Data...");
	}

}
