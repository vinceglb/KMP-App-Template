package com.jetbrains.kmpapp.data

import org.koin.core.annotation.Factory
import org.koin.core.annotation.InjectedParam
import org.koin.mp.KoinPlatformTools

@Factory
class IdGenerator(@InjectedParam private val prefix : String) {
    
    fun generate() : String = prefix + KoinPlatformTools.generateId()
}