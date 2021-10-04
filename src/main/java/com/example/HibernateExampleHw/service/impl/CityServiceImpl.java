package com.example.HibernateExampleHw.service.impl;

import com.example.HibernateExampleHw.exception.ResourceNotFoundException;
import com.example.HibernateExampleHw.model.City;
import com.example.HibernateExampleHw.repository.CityRepository;
import com.example.HibernateExampleHw.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public City get(long id) {
        return cityRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("City", "id", id));
    }

    @Override
    public City update(City city, long id) {
        City existingCity = cityRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("City", "id", id));
        existingCity.setName(city.getName());
        cityRepository.save(existingCity);
        return null;
    }

}
