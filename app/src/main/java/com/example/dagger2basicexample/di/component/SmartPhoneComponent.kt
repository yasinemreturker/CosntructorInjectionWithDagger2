package com.example.dagger2basicexample.di.component

import com.example.dagger2basicexample.ui.smartphone.SmartPhone
import dagger.Component

@Component
interface SmartPhoneComponent {
   fun getSmartPhone() : SmartPhone
}