package com.dimplejoon.dice_app_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.dimplejoon.dice_app_study.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val diceImage1 = binding.dice1

        val diceImage2 = binding.dice2

        binding.startBtn.setOnClickListener{

            Toast.makeText(this, "Dice Start~!", Toast.LENGTH_LONG).show()

            //intだから
            val randomDice1 = Random.nextInt(1,7).toString()

            val randomDice2 = Random.nextInt(1,7).toString()


            //1番目のDice
            when(randomDice1){

                "1" -> diceImage1.setImageResource(R.drawable.dice1)

                "2" -> diceImage1.setImageResource(R.drawable.dice2)

                "3" -> diceImage1.setImageResource(R.drawable.dice3)

                "4" -> diceImage1.setImageResource(R.drawable.dice4)

                "5" -> diceImage1.setImageResource(R.drawable.dice5)

                "6" -> diceImage1.setImageResource(R.drawable.dice6)

            }

            //2番目のDice

            when(randomDice2){

                "1" -> diceImage2.setImageResource(R.drawable.dice1)

                "2" -> diceImage2.setImageResource(R.drawable.dice2)

                "3" -> diceImage2.setImageResource(R.drawable.dice3)

                "4" -> diceImage2.setImageResource(R.drawable.dice4)

                "5" -> diceImage2.setImageResource(R.drawable.dice5)

                "6" -> diceImage2.setImageResource(R.drawable.dice6)

            }

        }

    }
}