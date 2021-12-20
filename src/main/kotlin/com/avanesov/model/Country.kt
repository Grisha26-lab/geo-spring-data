package com.avanesov.model

import javax.persistence.*

@Entity
@Table(name = "country")
data class Country(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long =0,
    @Column(name = "name")
    val name: String
)