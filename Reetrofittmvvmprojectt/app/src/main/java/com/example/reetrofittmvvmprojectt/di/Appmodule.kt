package com.example.reetrofittmvvmprojectt.di

import com.example.reetrofittmvvmprojectt.viewmodel.AnasayfaViewModel
import com.example.reetrofittmvvmprojectt.retrofit.Apiutilss
import com.example.reetrofittmvvmprojectt.retrofit.Retrofitdao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Appmodule {
    @Provides
    @Singleton
    fun provedidaoo(dao: Retrofitdao): AnasayfaViewModel {
        return AnasayfaViewModel(dao)
    }
    @Provides
    @Singleton
    fun provedidaooo(): Retrofitdao {
        return Apiutilss.retrofitdao()
    }
}