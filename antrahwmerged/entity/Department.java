package com.example.antrahwmerged.entity;

import javax.persistence.*;
@Table
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Did", nullable = false)
    private Integer id;

    @Column(name = "Name")
    private String name;

    public Department(Department department) {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}