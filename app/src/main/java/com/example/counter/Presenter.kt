package com.example.counter

import android.graphics.Color

class Presenter {
    private val model = Injector.getModel()
    private lateinit var view: View

    fun increment() {
        model.increment()
        view.showCount(model.count)
        setChanges()
    }

    fun decrement() {
        model.decrement()
        view.showCount(model.count)
        setChanges()
    }

    fun setChanges() {
        if (model.count == 10){
            view.showToast("congrats!")
        }
        if (model.count == 15){
            view.setColor(Color.GREEN)
        }
        else view.setColor(Color.GRAY)
    }

    fun fillCounterView(view: View) {
        this.view = view
    }
}