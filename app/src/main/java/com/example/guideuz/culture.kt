package com.example.guideuz

import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_culture.*

class culture : AppCompatActivity() {

    private lateinit var mp1: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culture)



        mp1 = MediaPlayer.create(this, R.raw.secretlove)
        mp1.isLooping = true
        var mediastate: Int = 0

        fab.setOnClickListener(){
            if(mediastate == 0){
                fab.setImageResource(android.R.drawable.ic_media_pause);
                mediastate = 1;
                mp1.start()
                Toast.makeText(this, "Started playing Secret Love by Sulton Ali", Toast.LENGTH_LONG).show()
            }
            else{
                fab.setImageResource(android.R.drawable.ic_media_play);
                mediastate = 0;
                mp1.pause();
            }
        }

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if ( keyCode == KeyEvent.KEYCODE_BACK) {
            onBackPressed()
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onBackPressed() {
        mp1.stop()
        finish()
    }

}