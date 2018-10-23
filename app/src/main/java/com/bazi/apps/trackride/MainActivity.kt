package com.bazi.apps.trackride

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bazi.apps.trackride.addtrip.AddTripActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val intent: Intent = AddTripActivity.create(this)
            startActivity(intent)
        }
    }
}
