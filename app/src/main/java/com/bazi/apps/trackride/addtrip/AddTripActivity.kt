package com.bazi.apps.trackride.addtrip

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bazi.apps.trackride.R
import kotlinx.android.synthetic.main.activity_add_trip.*

class AddTripActivity : AppCompatActivity() {

    private lateinit var addTripPresenter: AddTripPresenter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_trip)
        val addTripView: AddTripView = AddTripView(tv_add_trip)
        addTripPresenter = AddTripPresenter(addTripView);
        addTripPresenter.startPresenting()
    }

    override fun onDestroy() {
        addTripPresenter.stopPresenting()
        super.onDestroy()
    }

    companion object {
        fun create(context: Context): Intent {
            return Intent(context, AddTripActivity::class.java);
        }
    }
}
