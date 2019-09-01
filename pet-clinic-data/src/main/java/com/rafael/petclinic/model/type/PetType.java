package com.rafael.petclinic.model.type;

import com.rafael.petclinic.model.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PetType extends BaseEntity {
    private String name;
}
