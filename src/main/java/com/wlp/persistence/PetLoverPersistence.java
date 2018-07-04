package com.wlp.persistence;

import com.wlp.domain.PetLover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetLoverPersistence extends JpaRepository<PetLover, Long> {
}
