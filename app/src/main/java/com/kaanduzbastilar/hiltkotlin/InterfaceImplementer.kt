package com.kaanduzbastilar.hiltkotlin

import javax.inject.Inject

class InterfaceImplementer
    @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "My Interface Implementor"
    }
}