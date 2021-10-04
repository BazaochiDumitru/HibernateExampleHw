package com.example.HibernateExampleHw.controller;

import com.example.HibernateExampleHw.model.City;
import com.example.HibernateExampleHw.service.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CityController {
    private CityService cityService;

    public CityController(CityService cityService) {
        super();
        this.cityService = cityService;
    }

    @PostMapping
    public ResponseEntity<City> create(@RequestBody City city) {
        return new ResponseEntity<City>(cityService.save(city), HttpStatus.CREATED);
    }
}
