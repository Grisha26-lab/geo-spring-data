package com.avanesov.service


import com.avanesov.model.Country
import com.avanesov.service.dto.CountryDto

interface CountryService {

    fun getAllCountry(): List<Country>

    fun geyById(id: Long): Country

    fun create (countryDto: CountryDto)


}