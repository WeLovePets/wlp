package com.wlp.persistence;

import com.wlp.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetPersistence extends JpaRepository<Pet, Long> {
}
