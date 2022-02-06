package com.laboratory.test_lab_web.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Firstname, Lastname, Email;
    private Long num;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Offers> offers;

    public Orders(){

    }
}
