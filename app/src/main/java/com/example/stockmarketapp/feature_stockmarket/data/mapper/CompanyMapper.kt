package com.example.stockmarketapp.feature_stockmarket.data.mapper

import com.example.stockmarketapp.feature_stockmarket.data.local.CompanyListingEntity
import com.example.stockmarketapp.feature_stockmarket.data.remote.dto.CompanyInfoDto
import com.example.stockmarketapp.feature_stockmarket.domain.model.CompanyInfo
import com.example.stockmarketapp.feature_stockmarket.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol =  symbol ?: "",
        description =  description ?: "",
        name =  name ?: "",
        country =  country ?: "",
        industry =  industry ?: ""
    )
}