package com.example.HibernateExampleHw.service;

import com.example.HibernateExampleHw.model.Country;

import java.util.List;

public interface CountryService {
    Country save(Country country);

    List<Country> getAll();

    Country get(long id);

    Country update(Country country, long id);
}
