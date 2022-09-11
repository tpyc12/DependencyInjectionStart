package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.*
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    @ApplicationScope
    @ProdQualifier
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @Binds
    @ApplicationScope
    @TestQualifier
    fun bindTestRemoteDataSource(impl: ExampleTestRemoteDataSourceImpl): ExampleRemoteDataSource
}