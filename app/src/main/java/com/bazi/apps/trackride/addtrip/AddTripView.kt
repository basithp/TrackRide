package com.bazi.apps.trackride.addtrip

import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.TextView
import com.bazi.apps.trackride.View


class AddTripView(private val label: TextView) : View {

    override fun show() {
        label.visibility = VISIBLE
        label.text = "Welcome"
    }

    override fun hide() {
        label.visibility = GONE
    }
}
