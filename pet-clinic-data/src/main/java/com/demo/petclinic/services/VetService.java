package com.demo.petclinic.services;

import com.demo.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findbyId(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
