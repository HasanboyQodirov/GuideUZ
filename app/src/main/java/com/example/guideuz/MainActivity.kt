package com.example.guideuz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_activity_main);

        



        btnReg.setOnClickListener(){
            val intent = Intent(this, regions::class.java)
            startActivity(intent)
        }

        btnCities.setOnClickListener(){
            val intent = Intent(this, cities::class.java)
            startActivity(intent)
        }

        btnNP.setOnClickListener(){
            val intent = Intent(this,  NationalParks::class.java)
            startActivity(intent)
        }

        btnEatDrink.setOnClickListener(){
            val intent = Intent(this,  eatdrink::class.java)
            startActivity(intent)
        }

        btnPhrasebook.setOnClickListener() {
            val intent = Intent(this,  phrasebook::class.java)
            startActivity(intent)
        }

        btnCulture.setOnClickListener(){
            val intent = Intent(this,  about::class.java)
            startActivity(intent)
        }

        fab.setOnClickListener(){
            val intent = Intent(this,  gallery::class.java)
            startActivity(intent)
        }
    }

}