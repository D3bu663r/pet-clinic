package com.rafael.petclinic.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialities")
public class SpecialityEntity extends BaseEntity {
    @Column(name = "description")
    private String description;
}
