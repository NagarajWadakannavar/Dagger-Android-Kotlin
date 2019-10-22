package com.example.daggerAndroid.di.presentation

import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog
import com.example.daggerAndroid.MainActivity
import com.example.daggerAndroid.R
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun provideAlertDialog(mainActivity: MainActivity): AlertDialog {
        val builder = AlertDialog.Builder(mainActivity)
            .setTitle(mainActivity.resources.getString(R.string.app_name))
            .setMessage("This is a sample POC which demonstrates the use of Dagger-Android")
            .setPositiveButton("OK" ) { dialog, which -> }
        return builder.create()
    }
}