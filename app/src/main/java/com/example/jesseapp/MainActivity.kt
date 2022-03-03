package com.example.jesseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val textviewname = findViewById<TextView>(R.id.textviewname)
        val buttonAdd = findViewById<Button>(R.id.buttonADD)
        val buttonSubtract = findViewById<Button>(R.id.buttonSUBTRACT)
        val textviewcount = findViewById<TextView>(R.id.textViewcount)

        textviewcount.text=count.toString()

        buttonAdd.setOnClickListener {
            val newNumber = add()
            textviewcount.text=newNumber.toString()
        }
        buttonSubtract.setOnClickListener {
            val newNumber=subtract()
            textviewcount.text=newNumber.toString()
        }

    }
    private fun add():Int {
        val newNumber=count++
        return newNumber
    }
    private fun subtract (): Int {
        val newNumber=count--
        return newNumber
    }
}