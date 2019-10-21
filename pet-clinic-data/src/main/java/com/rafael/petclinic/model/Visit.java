package com.rafael.petclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    private Pet pet;
}
