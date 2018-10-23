package com.bazi.apps.trackride.addtrip

import com.bazi.apps.trackride.Presenter

class AddTripPresenter(private val view: AddTripView) : Presenter {

    override fun startPresenting() {
        view.show()
    }

    override fun stopPresenting() {
        view.hide()
    }
}
