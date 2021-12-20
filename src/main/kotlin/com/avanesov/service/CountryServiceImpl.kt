package com.avanesov.service

import com.avanesov.dao.CountryDao
import com.avanesov.model.Country
import com.avanesov.service.dto.CountryDto
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl(private val countryDao: CountryDao) : CountryService {
    override fun getAllCountry(): List<Country> = countryDao.findAll().toList()

    override fun geyById(id: Long): Country =
        countryDao.findById(id).orElseThrow { NoSuchElementException("Такой страны нету (((") }

    override fun create(country: CountryDto) {
        val newCountry = Country(
            name = country.name,
        )
        countryDao.save(newCountry)
    }





}