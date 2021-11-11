package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        val luckyNumber = 4
        val rollResultTextView = findViewById<TextView>(R.id.rollResultTextView)
        val resultMessageTextView = findViewById<TextView>(R.id.resultMessageTextView)

        rollResultTextView.text = rollResult.toString()
        when (rollResult) {
            luckyNumber -> resultMessageTextView.text = "You win!"
            else -> resultMessageTextView.text = "You lose..."
        }
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}