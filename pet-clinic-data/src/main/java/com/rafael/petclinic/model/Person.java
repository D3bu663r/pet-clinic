package com.rafael.petclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
class Person extends BaseEntity {
    private String firstName;
    private String lastName;
}