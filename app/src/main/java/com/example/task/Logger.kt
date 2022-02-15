package com.example.task

import java.io.File

class Logger() {
    private val FILE_NAME = "MyApp.log"

    init {
        File("application.log").writeText("Hello, Logging")
    }

    fun log(text : String){
        //file.writeText(text + "\n")
    }
}