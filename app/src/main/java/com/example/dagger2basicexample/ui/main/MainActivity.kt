package com.example.dagger2basicexample.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2basicexample.R
import com.example.dagger2basicexample.di.component.DaggerSmartPhoneComponent
import com.example.dagger2basicexample.ui.base.SmartPhoneApplication
import com.example.dagger2basicexample.ui.smartphone.SmartPhone
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as SmartPhoneApplication).smartPhoneComponent
            .inject(this)
        smartPhone.makeACallWithRecording()

    }
}