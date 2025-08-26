package com.example.cryptoapp.di

import android.app.Application
import com.example.cryptoapp.data.db.AppDatabase
import com.example.cryptoapp.data.db.CoinInfoDao
import com.example.cryptoapp.data.network.ApiFactory
import com.example.cryptoapp.data.network.ApiService
import com.example.cryptoapp.data.repository.CoinRepositoryImpl
import com.example.cryptoapp.domain.repository.CoinRepository
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindRepository(impl: CoinRepositoryImpl): CoinRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideCoinInfoDao(
            application: Application
        ) : CoinInfoDao {
            return AppDatabase.getInstance(application).coinInfoDao()
        }

        @ApplicationScope
        @Provides
        fun provideApiService() : ApiService {
            return ApiFactory.apiService
        }
    }
}