package com.example.dagger2basicexample.di.module

import com.example.dagger2basicexample.ui.memorycard.MemoryCard
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {

    @Provides
    fun providesMemoryCard(): MemoryCard{
        return MemoryCard()
    }
}