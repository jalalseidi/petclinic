package com.demo.petclinic.services;

import com.demo.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastname);

    Owner findbyId(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
