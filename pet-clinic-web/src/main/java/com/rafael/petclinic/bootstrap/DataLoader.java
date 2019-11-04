package com.rafael.petclinic.bootstrap;

import com.rafael.petclinic.entities.OwnerEntity;
import com.rafael.petclinic.entities.PetTypeEntity;
import com.rafael.petclinic.entities.VetEntity;
import com.rafael.petclinic.service.OwnerService;
import com.rafael.petclinic.service.PetTypeService;
import com.rafael.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetTypeEntity dog = new PetTypeEntity();
        dog.setName("Dog");

        PetTypeEntity savedDogPetType = petTypeService.save(dog);

        PetTypeEntity cat = new PetTypeEntity();
        cat.setName("Cat");

        PetTypeEntity savedCatPetType = petTypeService.save(cat);

        OwnerEntity owner1 = OwnerEntity.builder()
                .firstName("Michael")
                .lastName("Weston")
                .address("123 Brickerel")
                .city("Miami")
                .telephone("16988113344")
                .build();

        ownerService.save(owner1);

        OwnerEntity owner2 = OwnerEntity.builder()
                .firstName("Fiona")
                .lastName("Glenanne")
                .address("123 Brickerel")
                .city("Miami")
                .telephone("16988113344")
                .build();

        ownerService.save(owner2);

        System.out.println("Loader owners");

        VetEntity vet1 = VetEntity.builder()
                .firstName("Sam")
                .lastName("Axe")
                .build();

        vetService.save(vet1);

        VetEntity vet2 = VetEntity.builder()
                .firstName("Jessie")
                .lastName("Porter")
                .build();

        vetService.save(vet2);

        System.out.println("Loader vets");

    }
}
