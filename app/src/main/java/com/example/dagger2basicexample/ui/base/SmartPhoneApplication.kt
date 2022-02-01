package com.example.dagger2basicexample.ui.base

import android.app.Application
import com.example.dagger2basicexample.di.component.DaggerSmartPhoneComponent
import com.example.dagger2basicexample.di.component.SmartPhoneComponent
import com.example.dagger2basicexample.di.module.MemoryCardModule

class SmartPhoneApplication : Application() {
    lateinit var smartPhoneComponent: SmartPhoneComponent
    override fun onCreate() {
        smartPhoneComponent = initDagger()
        super.onCreate()
    }

    private fun initDagger(): SmartPhoneComponent =
        DaggerSmartPhoneComponent.builder()
            .memoryCardModule(MemoryCardModule(1000))
            .build()
}