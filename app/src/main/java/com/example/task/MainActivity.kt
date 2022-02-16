package com.example.task

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.math.pow

class MainActivity : Activity() {
    companion object{
        const val VARIABLE_NAME = "VARIABLE"
    }

    private lateinit var numberTextView: TextView
    private lateinit var secondActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("INFO", "onCreate")
        setContentView(R.layout.activity_main)
        numberTextView = findViewById(R.id.number_text_view)
        secondActivityButton = findViewById(R.id.second_activity_button_id)
        numberTextView.text = (savedInstanceState?.get(VARIABLE_NAME) ?: 0).toString().toInt().toString()
        secondActivityButton.setOnClickListener {
            val intent = Intent(
                this,
                SecondActivity::class.java
            ).apply {
                putExtra(VARIABLE_NAME, numberTextView.text.toString().toDouble().pow(2).toInt())
            }
            startActivity(intent)
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        numberTextView.text = savedInstanceState.getInt(VARIABLE_NAME).toString()
        Log.d("INFO", "onRestoreInstanceState")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(VARIABLE_NAME, numberTextView.text.toString().toInt()+1)
        super.onSaveInstanceState(outState)
        Log.d("INFO","onSaveInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.d("INFO", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("INFO", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("INFO", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("INFO", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("INFO", "onDestroy")
    }
}