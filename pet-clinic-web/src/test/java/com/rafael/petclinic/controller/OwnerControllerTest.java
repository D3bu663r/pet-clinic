package com.rafael.petclinic.controller;

import com.rafael.petclinic.entities.OwnerEntity;
import com.rafael.petclinic.service.impl.OwnerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerServiceImpl ownerService;

    @InjectMocks
    OwnerController ownerController;

    Set<OwnerEntity> ownerEntities;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        ownerEntities = new HashSet<>();
        ownerEntities.add(OwnerEntity.builder().id(1L).build());
        ownerEntities.add(OwnerEntity.builder().id(2L).build());

        mockMvc = MockMvcBuilders
                .standaloneSetup(ownerController)
                .build();
    }

    @Test
    void listAll() throws Exception {
        when(ownerService.findAll()).thenReturn(ownerEntities);

        mockMvc.perform(get("/owners"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/index"))
                .andExpect(model().attribute("owners", hasSize(2)));

        verify(ownerService).findAll();
    }
}