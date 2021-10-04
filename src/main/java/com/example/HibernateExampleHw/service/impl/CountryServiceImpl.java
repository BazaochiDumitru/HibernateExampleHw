package com.example.HibernateExampleHw.service.impl;

import com.example.HibernateExampleHw.exception.ResourceNotFoundException;
import com.example.HibernateExampleHw.model.Country;
import com.example.HibernateExampleHw.repository.CountryRepository;
import com.example.HibernateExampleHw.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        super();
        this.countryRepository = countryRepository;
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country get(long id) {
        return countryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Country", "id", id));
    }
}
