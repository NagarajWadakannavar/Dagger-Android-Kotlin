package com.example.dagger.dependencyinjection.application

import com.example.daggerAndroid.MyApplication
import com.example.daggerAndroid.di.application.ActivityBuilderModule
import com.example.daggerAndroid.di.application.ApplicationModule
import com.example.daggerAndroid.di.application.NetworkModule

import javax.inject.Singleton

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Singleton
@Component(modules = [AndroidInjectionModule::class, ApplicationModule::class, NetworkModule::class, ActivityBuilderModule::class])
interface ApplicationComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApplication>()

}
