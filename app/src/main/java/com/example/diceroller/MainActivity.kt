package com.example.diceroller

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 : Button = findViewById(R.id.btn1)

        val text : TextView = findViewById(R.id.tvRoll)

        val tvRoll : ImageView = findViewById(R.id.dicePhase)
        val Play = MediaPlayer.create(this, R.raw.diceroll)

        btn1.setOnClickListener {
           Play.start()
            val randomNum = (1..6).random()

            text.text = randomNum.toString()

            if (randomNum==1)
            {
                tvRoll.setImageResource(R.drawable.dice1)
            }
            else if (randomNum==2)
            {
                tvRoll.setImageResource(R.drawable.dice2)
            }
            else if (randomNum==3)
            {
                tvRoll.setImageResource(R.drawable.dice3)
            }
            else if (randomNum==4)
            {
                tvRoll.setImageResource(R.drawable.dice4)
            }
            else if (randomNum==5)
            {
                tvRoll.setImageResource(R.drawable.dice5)
            }
            else if (randomNum==6)
            {
                tvRoll.setImageResource(R.drawable.dice6)
            }
        }
    }
}