package com.citiesdb.comapi.countries.repository;

import com.citiesdb.comapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
