package com.rafael.petclinic.service.impl;

import com.rafael.petclinic.entities.OwnerEntity;
import com.rafael.petclinic.repositories.OwnerRepository;
import com.rafael.petclinic.repositories.PetRepository;
import com.rafael.petclinic.repositories.PetTypeRepository;
import com.rafael.petclinic.service.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerServiceImplTest {
    public static final String LAST_NAME = "Smith";
    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerServiceImpl ownerService;

    OwnerEntity returnOwnerEntity;

    @BeforeEach
    void setUp() {
        returnOwnerEntity = OwnerEntity.builder().id(1L).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwnerEntity);

        OwnerEntity ownerEntity = ownerService.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, ownerEntity.getLastName());

        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
        Set<OwnerEntity> returnOwnerEntities =  new HashSet<>();
        returnOwnerEntities.add(OwnerEntity.builder().id(1L).build());
        returnOwnerEntities.add(OwnerEntity.builder().id(1L).build());

        when(ownerRepository.findAll()).thenReturn(returnOwnerEntities);

        Set<OwnerEntity> entities = ownerService.findAll();

        assertNotNull(entities);
        assertEquals(2, entities.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwnerEntity));

        OwnerEntity ownerEntity = ownerService.findById(1L);

        assertNotNull(ownerEntity);
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        OwnerEntity ownerEntity = ownerService.findById(1L);

        assertNull(ownerEntity);
    }

    @Test
    void save() {
        OwnerEntity ownerEntityToSave = OwnerEntity.builder().id(1L).build();

        when(ownerRepository.save(any())).thenReturn(returnOwnerEntity);

        OwnerEntity savedOwnerEntity = ownerService.save(ownerEntityToSave);

        assertNotNull(savedOwnerEntity);
    }

    @Test
    void delete() {
        ownerService.delete(returnOwnerEntity);

        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
        ownerService.deleteById(1L);

        verify(ownerRepository).deleteById(anyLong());
    }
}