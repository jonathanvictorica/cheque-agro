package com.jmg.checkagro.provider.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "provider")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Provider implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false, length = 10)
    private String documentType;
    @Column(nullable = false, length = 20)
    private String documentNumber;
    @Column(nullable = false, length = 100)
    private String businessName;
    @Column(nullable = false, length = 250)
    private String email;
    @Column(nullable = false, length = 20)
    private String phone;
    @Column(nullable = false)
    private LocalDate creation;
    @Column(nullable = false, columnDefinition = "integer default 1")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean active;
}
