package com.example.dagger2basicexample.ui.simcard

import android.util.Log
import com.example.dagger2basicexample.ui.serviceprovider.ServiceProvider
import javax.inject.Inject

class SIMCard @Inject constructor(private  val serviceProvider: ServiceProvider) {


    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}
