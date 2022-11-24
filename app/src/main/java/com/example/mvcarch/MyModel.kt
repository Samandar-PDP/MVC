package com.example.mvcarch

import java.util.Observable

class MyModel: Observable() {
    private var counter = 0
    fun increment() {
        counter++
        setChanged()
        notifyObservers()
    }
    fun decrement() {
        if (counter > 0) {
            counter--
            setChanged()
            notifyObservers()
        }
    }
    fun getValue(): Int {
        return counter
    }
}