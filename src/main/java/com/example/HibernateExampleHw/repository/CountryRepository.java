package com.example.HibernateExampleHw.repository;

import com.example.HibernateExampleHw.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
