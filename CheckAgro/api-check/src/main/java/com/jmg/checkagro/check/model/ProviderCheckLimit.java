package com.jmg.checkagro.check.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "providerCheckLimit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProviderCheckLimit {
    @EmbeddedId
    private ProviderCheckLimit.ProviderCheckLimitId id;

    @Column(nullable = false,precision = 17, scale = 2)
    private BigDecimal checkAmountLimit;

    @Column(nullable = false,precision = 17, scale = 2)
    private BigDecimal checkAmountReceived;

    @Column(nullable = false,precision = 17, scale = 2)
    private BigDecimal checkAmountConsumed;
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Builder
    @Embeddable
    public static class ProviderCheckLimitId implements Serializable {
        @Column(nullable = false, length = 10)
        private String documentTypeProvider;
        @Column(nullable = false, length = 20)
        private String documentValueProvider;
    }
}
