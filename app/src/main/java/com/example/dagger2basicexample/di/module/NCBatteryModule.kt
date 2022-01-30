package com.example.dagger2basicexample.di.module

import com.example.dagger2basicexample.ui.battery.Battery
import com.example.dagger2basicexample.ui.battery.NickelCadmiumBattery
import dagger.Binds
import dagger.Module

@Module
abstract class NCBatteryModule {
    @Binds
    abstract fun bindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery): Battery
}