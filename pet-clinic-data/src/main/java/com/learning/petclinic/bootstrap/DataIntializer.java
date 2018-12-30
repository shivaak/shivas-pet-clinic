/**
 * 
 */
package com.learning.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.petclinic.model.Owner;
import com.learning.petclinic.model.Vet;
import com.learning.petclinic.services.OwnerService;
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
	
	public DataIntializer(){
		this.ownerService = new OwnerServiceMap();
		this.vetService = new VetServiceMap();
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bootstraping Data...");
		
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Muruga");
		owner1.setLastName("God");
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Shiva");
		owner2.setLastName("Krishnan");
		
		Vet vet1 = new Vet();
		vet1.setId(3L);
		vet1.setFirstName("Shankar");
		vet1.setLastName("Perumal");
		
		Vet vet2 = new Vet();
		vet2.setId(4L);
		vet2.setFirstName("Vaidhiya");
		vet2.setLastName("Nadhan");
		
		ownerService.save(owner1);
		ownerService.save(owner2);
		
		vetService.save(vet1);
		vetService.save(vet2);
		
		System.out.println("Completed Loading Data...");
	}

}
