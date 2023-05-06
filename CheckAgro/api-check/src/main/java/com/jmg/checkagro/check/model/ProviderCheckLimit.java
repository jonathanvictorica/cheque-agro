package com.jmg.checkagro.check.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "providerCheckLimit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProviderCheckLimit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
