package com.example.daggerAndroid.di.application

import android.content.Context
import android.content.SharedPreferences
import com.example.daggerAndroid.MyApplication
import com.example.daggerAndroid.utils.Constants
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {
    @Provides
    fun provideApplicationContext(application: MyApplication): Context {
        return application
    }

    @Provides
    fun provideSharedPreference(context: Context): SharedPreferences {
        return context.getSharedPreferences(Constants.PREFERENCE_NAME, Context.MODE_PRIVATE)
    }
}