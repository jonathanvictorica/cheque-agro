package com.jmg.checkagro.check.service;

import com.jmg.checkagro.check.model.Check;
import com.jmg.checkagro.check.repository.CheckRepository;
import com.jmg.checkagro.check.repository.CustomerCheckLimitRepository;
import com.jmg.checkagro.check.repository.ProviderCheckLimitRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CheckService {

    private final CheckRepository checkRepository;
    private final CustomerCheckLimitRepository customerCheckLimitRepository;
    private final ProviderCheckLimitRepository providerCheckLimitRepository;

    public CheckService(CheckRepository checkRepository, CustomerCheckLimitRepository customerCheckLimitRepository, ProviderCheckLimitRepository providerCheckLimitRepository) {
        this.checkRepository = checkRepository;
        this.customerCheckLimitRepository = customerCheckLimitRepository;
        this.providerCheckLimitRepository = providerCheckLimitRepository;
    }

    public Long create(Check check) {
        return null;
    }

    public void pay(Long id) {
    }

    public void cancel(Long id) {
    }

    public Check getById(Long id) {
        return null;
    }

    public void registerCustomer(String documentType, String documentValue) {
        log.info("registerCustomer");
    }

    public void registerProvider(String documentType, String documentValue) {
        log.info("registerProvider");
    }
}
