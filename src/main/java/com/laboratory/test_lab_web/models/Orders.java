package com.laboratory.test_lab_web.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Firstname, Lastname, Email, offers;
    private Long num;


    public Orders() {

    }

    public Orders(String firstname, String lastname) {
        Firstname = firstname;
        Lastname = lastname;
    }

    public Orders(String firstname, String lastname, String email, String offers, Long num, Set<User> users) {
        Firstname = firstname;
        Lastname = lastname;
        Email = email;
        this.offers = offers;
        this.num = num;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @ManyToMany(cascade=CascadeType.ALL)
    private Set<User> users;


}
