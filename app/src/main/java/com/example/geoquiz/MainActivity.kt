package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        trueButton.setOnClickListener {
            Snackbar.make(
                it,
                "Correct!",
                Snackbar.LENGTH_LONG
            ).show()
        }
        falseButton.setOnClickListener {
            Snackbar.make(
                it,
                "Incorrect!",
                Snackbar.LENGTH_LONG
            ).show()
        }

    }
}