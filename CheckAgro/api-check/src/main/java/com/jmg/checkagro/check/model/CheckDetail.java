package com.jmg.checkagro.check.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "checkDetail")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CheckDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "check_id", nullable = false, referencedColumnName = "check_id"
          )
    private Check check;

    @Column(nullable = false, length = 250)
    private String concept;
    @Column(precision = 17, scale = 2,nullable = false )
    private BigDecimal amountUnit;
    @Column(nullable = false)
    private Integer quantity;



}
