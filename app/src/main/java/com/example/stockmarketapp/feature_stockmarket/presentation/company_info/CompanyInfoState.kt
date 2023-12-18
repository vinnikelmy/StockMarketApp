package com.example.stockmarketapp.feature_stockmarket.presentation.company_info

import com.example.stockmarketapp.feature_stockmarket.domain.model.CompanyInfo
import com.example.stockmarketapp.feature_stockmarket.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
