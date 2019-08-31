package petclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import petclinic.model.type.PetType;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
