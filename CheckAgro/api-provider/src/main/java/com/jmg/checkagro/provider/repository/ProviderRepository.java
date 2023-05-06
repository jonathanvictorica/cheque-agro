package com.jmg.checkagro.provider.repository;

import com.jmg.checkagro.check.model.Check;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Check,Long> {
}
