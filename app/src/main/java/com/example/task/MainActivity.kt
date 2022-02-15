package com.example.task

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {
    companion object{
        const val VARIABLE_NAME = "VARIABLE"
    }
    private var count = 0

    private lateinit var numTextView: TextView
    private lateinit var startSecondActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        numTextView = findViewById(R.id.num_text_view)
        startSecondActivityButton = findViewById(R.id.start_second_activity_button)
        count = (savedInstanceState?.get(VARIABLE_NAME) ?: 0).toString().toInt()
        numTextView.text = count.toString()
        startSecondActivityButton.setOnClickListener {
            val intent = Intent(
                this,
                SecondActivity::class.java
            ).apply {
                putExtra(VARIABLE_NAME, count * count)
            }
            startActivity(intent)
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        count = savedInstanceState.getInt(VARIABLE_NAME)
        numTextView.text = count.toString()
        //logger.log("RestoreInstanceState")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        count+=1
        outState.putInt(VARIABLE_NAME, count)
        super.onSaveInstanceState(outState)
    }

    override fun onStart() {
        super.onStart()
        //logger.log("Start")
    }

    override fun onResume() {
        super.onResume()
        //logger.log("Resume")

    }

    override fun onPause() {
        super.onPause()
        //logger.log("Pause")
    }

    override fun onStop() {
        super.onStop()
        //logger.log("Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        //logger.log("Destroy")
    }
}