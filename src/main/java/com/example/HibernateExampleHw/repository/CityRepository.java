package com.example.HibernateExampleHw.repository;

import com.example.HibernateExampleHw.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
