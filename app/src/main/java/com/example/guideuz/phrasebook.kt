package com.example.guideuz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phrasebook.*

class phrasebook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrasebook)


        btnCommon.setOnClickListener(){
            val intent = Intent(this,  common::class.java)
            startActivity(intent)
        }

        btnGreeting.setOnClickListener(){
            val intent = Intent(this,  greetings::class.java)
            startActivity(intent)
        }

        btnNumbers.setOnClickListener(){
            val intent = Intent(this,  numbers::class.java)
            startActivity(intent)
        }

        btnEmergency.setOnClickListener(){
            val intent = Intent(this,  emergency::class.java)
            startActivity(intent)
        }

        btnDirections.setOnClickListener(){
            val intent = Intent(this,  directions::class.java)
            startActivity(intent)
        }
    }
}