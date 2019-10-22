package com.example.daggerAndroid.di.application

import com.example.daggerAndroid.APIService
import com.example.daggerAndroid.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        val builder = Retrofit.Builder()
        builder.baseUrl(Constants.BASE_URL)
        builder.addConverterFactory(GsonConverterFactory.create())
        return builder.build()
    }

    @Provides
    fun provideAPIService(retrofit: Retrofit): APIService {
        return retrofit.create(APIService::class.java)
    }
}