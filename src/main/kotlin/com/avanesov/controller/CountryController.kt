package com.avanesov.controller

import com.avanesov.model.Country
import com.avanesov.service.CountryService
import com.avanesov.service.dto.CountryDto

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/counties")
class CountryController(private val countryService: CountryService) {

    @GetMapping
    fun getAllCountry():List<Country> = countryService.getAllCountry()

    @GetMapping("/{id}")
    fun getById(@PathVariable id:Long):Country = countryService.geyById(id)

    @PostMapping
    fun create(@RequestParam("country") dto: CountryDto) {
        countryService.create(dto)
    }
}