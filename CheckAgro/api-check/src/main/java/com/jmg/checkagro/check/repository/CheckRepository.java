package com.jmg.checkagro.check.repository;

import com.jmg.checkagro.check.model.Check;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckRepository extends JpaRepository<Check,Long> {
}
