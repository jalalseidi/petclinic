package com.demo.petclinic.model;

public class Pet {

    private PetType petType;
    private Owner owner;
    private LocaleDate birthdate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocaleDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocaleDate birthdate) {
        this.birthdate = birthdate;
    }
}
