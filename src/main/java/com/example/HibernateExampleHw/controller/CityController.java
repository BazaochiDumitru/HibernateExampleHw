package com.example.HibernateExampleHw.controller;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cities")
public class CityController {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;
}
