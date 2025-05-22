package org.example.bootcontainerreview.dto;

import org.example.bootcontainerreview.entity.Pet;

public record PetDTO(String name) {
    public Pet toEntity() {
        Pet pet = new Pet();
        pet.setName(name);
        return pet;
    }
}