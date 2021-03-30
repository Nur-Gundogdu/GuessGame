package com.nurgundogdu.hw2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*
import java.util.Random


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun randNum(): Int {
            return Random().nextInt(100)
        }
        var numberToGuess = randNum()
        var num = findViewById(R.id.num) as EditText
        val check = findViewById(R.id.button) as Button
        var skor = findViewById(R.id.textView2) as TextView
        var puan =100
        var uyari = findViewById(R.id.textView) as TextView
        check.setOnClickListener {
            var userGuess = Integer.parseInt(num.getText().toString())
            if (userGuess > numberToGuess) {
                uyari.setText("Daha küçük bir sayı deneyin")
                puan -= 1


            } else if (userGuess < numberToGuess) {
                uyari.setText("Daha büyük bir sayı deneyin")
                puan -= 1
            } else {
                num.setText("Bildiniz!")
            }
            skor.setText("Skorunuz: $puan")
            }


    }}






