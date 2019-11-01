package com.rafael.petclinic.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "specialities")
public class SpecialityEntity extends BaseEntity {
    @Column(name = "description")
    private String description;
}
