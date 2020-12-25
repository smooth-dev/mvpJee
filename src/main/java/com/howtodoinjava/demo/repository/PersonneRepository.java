package com.howtodoinjava.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.howtodoinjava.demo.model.Personne;

public interface PersonneRepository
extends JpaRepository<Personne, Long> {
List<Personne> findByNom(String rue);
//List<Personne> findByFirstName(String name);

}
