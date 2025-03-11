package am.demo.sfgpetrepo.service;

import am.demo.sfgpetrepo.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
