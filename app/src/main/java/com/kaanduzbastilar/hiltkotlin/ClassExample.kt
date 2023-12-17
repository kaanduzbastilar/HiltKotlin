package com.kaanduzbastilar.hiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
@Inject constructor(@FirstImplementor private val myInterfaceImplementer: MyInterface,
                    private val gson : Gson,
                    @SecondImplementer private val mySecondInterfaceImplementor: MyInterface)
{
    fun myFunction() : String{
        return "Working: ${myInterfaceImplementer.myPrintFunction()}"
    }

    fun secondFunction() : String{
        return "Working: ${mySecondInterfaceImplementor.myPrintFunction()}"
    }
}