package com.example.dagger2basicexample.di.component

import com.example.dagger2basicexample.di.module.MemoryCardModule
import com.example.dagger2basicexample.di.module.NCBatteryModule
import com.example.dagger2basicexample.ui.smartphone.SmartPhone
import dagger.Component

@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {
   fun getSmartPhone() : SmartPhone
}