package com.example.task

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.task.MainActivity.Companion.VARIABLE_NAME

class SecondActivity : AppCompatActivity() {

    private lateinit var numTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        numTextView = findViewById(R.id.num_text_view)
        numTextView.text = (intent.extras?.get(VARIABLE_NAME) ?: 0).toString()
        //HW1Application.logger.writeInLog(this.localClassName + " onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(VARIABLE_NAME, numTextView.text.toString())
        super.onSaveInstanceState(outState)
    }

    override fun onStart() {
        super.onStart()
        //HW1Application.logger.writeInLog(this.localClassName + " onStart")
    }

    override fun onResume() {
        super.onResume()
        //HW1Application.logger.writeInLog(this.localClassName + " onResume")

    }

    override fun onPause() {
        super.onPause()
        //HW1Application.logger.writeInLog(this.localClassName + " onPause")
    }

    override fun onStop() {
        super.onStop()
        //HW1Application.logger.writeInLog(this.localClassName + " onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        //HW1Application.logger.writeInLog(this.localClassName + " onDestroy")
    }
}