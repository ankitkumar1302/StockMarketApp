package com.plcoding.stockmarketapp.domain.repository

import com.plcoding.stockmarketapp.data.util.Resource
import com.plcoding.stockmarketapp.domain.model.CompanyListing
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(

        fetchFromRemote:Boolean,
        query:String

    ): Flow<Resource<List<CompanyListing>>>

}