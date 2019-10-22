package com.example.daggerAndroid.di.application

import com.example.daggerAndroid.MainActivity
import com.example.daggerAndroid.di.presentation.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    internal abstract fun bindMainActivity(): MainActivity
}