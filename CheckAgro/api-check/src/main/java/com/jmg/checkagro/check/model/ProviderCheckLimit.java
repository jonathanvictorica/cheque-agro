package com.jmg.checkagro.check.model;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "providerCheckLimit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProviderCheckLimit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( nullable = false,name = "id")
    private Long id;
    @Column(nullable = false, length = 10)
    private String documentTypeProvider;
    @Column(nullable = false, length = 20)
    private String documentValueProvider;

    @Column(nullable = false,precision = 17, scale = 2)
    private BigDecimal checkAmountLimit;

    @Column(nullable = false,precision = 17, scale = 2)
    private BigDecimal checkAmountReceived;

    @Column(nullable = false,precision = 17, scale = 2)
    private BigDecimal checkAmountConsumed;

}
