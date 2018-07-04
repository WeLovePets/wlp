package com.wlp.persistence;

import com.wlp.domain.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanPersistence extends JpaRepository<Human, Long> {
}
