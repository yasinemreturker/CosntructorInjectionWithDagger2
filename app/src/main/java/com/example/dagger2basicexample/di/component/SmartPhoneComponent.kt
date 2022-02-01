package com.example.dagger2basicexample.di.component

import com.example.dagger2basicexample.di.module.MemoryCardModule
import com.example.dagger2basicexample.di.module.NCBatteryModule
import com.example.dagger2basicexample.ui.main.MainActivity
import com.example.dagger2basicexample.ui.smartphone.SmartPhone
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {
   fun inject(mainActivity: MainActivity)
}