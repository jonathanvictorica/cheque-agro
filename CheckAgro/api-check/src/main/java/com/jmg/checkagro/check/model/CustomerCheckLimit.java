package com.jmg.checkagro.check.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "customerCheckLimit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerCheckLimit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( nullable = false,name = "id")
    private Long id;
    @Column(nullable = false, length = 10)
    private String documentTypeCustomer;
    @Column(nullable = false, length = 20)
    private String documentValueCustomer;

    @Column(nullable = false,precision = 17, scale = 2)
    private BigDecimal checkAmountLimit;

    @Column(nullable = false,precision = 17, scale = 2)
    private BigDecimal checkAmountPayed;

    @Column(nullable = false,precision = 17, scale = 2)
    private BigDecimal checkAmountConsumed;


}
