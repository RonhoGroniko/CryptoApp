package com.example.cryptoapp.di

import androidx.work.ListenableWorker
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
annotation class WorkerKey(val value: KClass<out ListenableWorker>)
