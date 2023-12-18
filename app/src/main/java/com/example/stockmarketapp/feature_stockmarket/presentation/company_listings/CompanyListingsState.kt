package com.example.stockmarketapp.feature_stockmarket.presentation.company_listings

import com.example.stockmarketapp.feature_stockmarket.domain.model.CompanyListing

data class CompanyListingsState(
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = "",
)
