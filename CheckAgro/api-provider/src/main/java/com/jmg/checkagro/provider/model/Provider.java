package com.jmg.checkagro.provider.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "check")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Provider {

    @Id
    private Long id;
}
