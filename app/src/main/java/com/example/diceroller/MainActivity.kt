package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button =findViewById(R.id.button)
        button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = (1..6).random()

        val drawableResource =
            when (dice) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

        val diceImage: ImageView = findViewById(R.id.imageView2)
        diceImage.setImageResource(drawableResource)

        val resultTextView: TextView = findViewById(R.id.textView2)
        resultTextView.text = dice.toString()
    }

    private fun randomNumber(numSides: Int) : Int{
        return (1..numSides).random()
    }

}