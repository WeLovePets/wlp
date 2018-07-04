package com.wlp.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pet {

    @Id
    private Long id;
    private String location;
}
