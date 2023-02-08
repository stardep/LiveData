package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ViewModelProvider(this).get(MainActivityLiveData::class.java)
        val mutableLiveData = model.getNumber()
        val tvNumber = findViewById<TextView>(R.id.number)
        mutableLiveData?.observe(this, { t -> tvNumber.text = t })
    }
}