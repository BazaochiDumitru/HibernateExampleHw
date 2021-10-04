package com.example.HibernateExampleHw.service.impl;

import com.example.HibernateExampleHw.model.Country;
import com.example.HibernateExampleHw.repository.CountryRepository;
import com.example.HibernateExampleHw.service.CountryService;
import org.springframework.stereotype.Service;

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
}
