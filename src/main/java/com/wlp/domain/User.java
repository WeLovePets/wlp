package com.wlp.domain;

import org.hibernate.annotations.Cascade;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import java.util.Calendar;

public class User {

    @Id
    private String id;
    private String name;
    private Calendar birthday;

    @OneToOne(mappedBy = "user")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Address address;

    private String sex;
    private String image;

}
