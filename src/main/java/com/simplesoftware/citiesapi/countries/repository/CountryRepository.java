package com.simplesoftware.citiesapi.countries.repository;

import com.simplesoftware.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
