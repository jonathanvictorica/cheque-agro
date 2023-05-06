package com.jmg.checkagro.customer.repository;

import com.jmg.checkagro.check.model.Check;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Check,Long> {
}
