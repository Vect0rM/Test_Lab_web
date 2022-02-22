package com.laboratory.test_lab_web.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Offers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String text, name;


    public Offers() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Offers(String name, String text) {
        this.name = name;
        this.text = text;
    }
}
