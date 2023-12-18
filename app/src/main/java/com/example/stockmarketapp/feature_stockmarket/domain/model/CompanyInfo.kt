package com.example.stockmarketapp.feature_stockmarket.domain.model

data class CompanyInfo(
    val symbol: String,
    val description: String,
    val name: String,
    val country: String,
    val industry: String
)