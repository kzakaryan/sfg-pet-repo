package am.demo.sfgpetrepo.service;

import am.demo.sfgpetrepo.model.Owner;
import am.demo.sfgpetrepo.model.Pet;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById (Long Id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
