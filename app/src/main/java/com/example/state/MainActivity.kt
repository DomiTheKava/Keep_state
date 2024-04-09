package com.example.state

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.textservice.TextInfo
import android.widget.Button
import android.widget.TextView

lateinit var button: Button
lateinit var textInfo: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)
        textInfo = findViewById<TextView>(R.id.clickedText)

        button.setOnClickListener {
            textInfo.text = "You clicked the button!"
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("saved_text", textInfo.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        textInfo.text = savedInstanceState.getString("saved_text")
    }

}