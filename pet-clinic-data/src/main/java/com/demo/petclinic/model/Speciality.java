package com.demo.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Speciality extends BaseEntitiy{

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
