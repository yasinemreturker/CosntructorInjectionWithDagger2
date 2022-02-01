package com.example.dagger2basicexample.di.module

import android.util.Log
import com.example.dagger2basicexample.ui.memorycard.MemoryCard
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memorySize: Int) {

    @Provides
    fun providesMemoryCard(): MemoryCard{
        Log.i("MYTAG","Size of the memory is $memorySize")
        return MemoryCard()
    }
}