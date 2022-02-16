package com.example.task

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.task.MainActivity.Companion.VARIABLE_NAME

class SecondActivity : AppCompatActivity() {

    private lateinit var numberTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        numberTextView = findViewById(R.id.number_text_view)
        numberTextView.text = (intent.extras?.get(VARIABLE_NAME) ?: 0).toString()
        Log.d("INFO","SecondActivity onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("INFO","SecondActivity onSaveInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.d("INFO","SecondActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("INFO","SecondActivity onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("INFO","SecondActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("INFO","SecondActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("INFO","SecondActivity onDestroy")
    }
}