package com.example.dagger2basicexample.ui.smartphone

import android.util.Log
import com.example.dagger2basicexample.ui.memorycard.MemoryCard
import com.example.dagger2basicexample.ui.battery.Battery
import com.example.dagger2basicexample.ui.simcard.SIMCard
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SmartPhone  @Inject constructor(val battery: Battery, val simCard: SIMCard, val memoryCard: MemoryCard) {

    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailablity()
        Log.i("MYTAG", "SmartPhone Constructed")
    }

    fun makeACallWithRecording() {
        Log.i("MYTAG", "Calling.....")
    }
}

