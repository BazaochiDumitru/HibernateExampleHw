package com.example.HibernateExampleHw.service.impl;

import com.example.HibernateExampleHw.model.City;
import com.example.HibernateExampleHw.repository.CityRepository;
import com.example.HibernateExampleHw.service.CityService;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        super();
        this.cityRepository = cityRepository;
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

}
