package com.example.stockmarketapp.feature_stockmarket.di

import com.example.stockmarketapp.feature_stockmarket.data.csv.CSVParser
import com.example.stockmarketapp.feature_stockmarket.data.csv.CompanyListingsParser
import com.example.stockmarketapp.feature_stockmarket.data.repository.StockRepositoryImpl
import com.example.stockmarketapp.feature_stockmarket.domain.model.CompanyListing
import com.example.stockmarketapp.feature_stockmarket.domain.model.IntradayInfo
import com.example.stockmarketapp.feature_stockmarket.data.csv.IntradayInfoParser
import com.example.stockmarketapp.feature_stockmarket.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}