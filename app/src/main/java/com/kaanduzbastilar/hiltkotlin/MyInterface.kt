package com.kaanduzbastilar.hiltkotlin

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction() : String

}

/*
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule{
    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementer: InterfaceImplementer) : MyInterface
}
 */

@InstallIn(ApplicationComponentManager::class)
@Module
class MyModule{
    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction() : MyInterface{
        return InterfaceImplementer()
    }

    @SecondImplementer
    @Singleton
    @Provides
    fun secondProviderFunction() : MyInterface{
        return SecondInterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gSonProvider() : Gson{
        return Gson()
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementer
