package com.example.dagger2basicexample.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2basicexample.R
import com.example.dagger2basicexample.di.DaggerSmartPhoneComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerSmartPhoneComponent.create()
            .getSmartPhone()
            .makeACallWithRecording()

//        val smartPhone = SmartPhone(
//            Battery(),
//            SIMCard(ServiceProvider()),
//            MemoryCard()
//        )
//            .makeACallWithRecording()

    }
}