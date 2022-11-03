package com.mvvmcleanarchitecture.currencyconverter.core.mapper

interface ApiMapper<E, D> {

    fun mapToDomain(apiEntity: E): D
}