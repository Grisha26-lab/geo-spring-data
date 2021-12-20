package com.avanesov.dao

import com.avanesov.model.Country
import org.springframework.data.repository.CrudRepository

interface CountryDao :CrudRepository<Country,Long>{


}