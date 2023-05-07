package com.jmg.checkagro.check.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Cache;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "checkVirtual")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Check implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( nullable = false,name = "check_Virtual_id")
    private Long id;
    @Column(nullable = false, length = 10)
    private String documentTypeCustomer;
    @Column(nullable = false, length = 20)
    private String documentValueCustomer;
    @Column(nullable = false, length = 10)
    private String documentTypeProvider;
    @Column(nullable = false, length = 20)
    private String documentValueProvider;
    @Column(nullable = false)
    private LocalDateTime emitDate;
    @Column(nullable = false,precision = 17, scale = 2)
    private BigDecimal amountTotal;
    @Column(nullable = false)
    private Integer monthsDuration;
    @Column(nullable = false,precision = 17, scale = 2)
    private BigDecimal commissionAgro;

    //EMIT, PAYED
    @Column(nullable = false, length = 10)
    private String stateCheck;

    @OneToMany(mappedBy = "checkVirtual", orphanRemoval = true, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    private Set<CheckDetail> checkDetails;
}
