package com.example.stockmarketapp.feature_stockmarket.domain.repository

import com.example.stockmarketapp.feature_stockmarket.domain.model.CompanyInfo
import com.example.stockmarketapp.feature_stockmarket.domain.model.CompanyListing
import com.example.stockmarketapp.feature_stockmarket.domain.model.IntradayInfo
import com.example.stockmarketapp.feature_stockmarket.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo (
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo (
        symbol: String
    ): Resource<CompanyInfo>
}