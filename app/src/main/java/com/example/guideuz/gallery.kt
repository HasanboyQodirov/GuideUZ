package com.example.guideuz

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_gallery.*

class gallery : AppCompatActivity() {
    private lateinit var mp1: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        mp1 = MediaPlayer.create(this, R.raw.happiness)
        mp1.isLooping = true
        var mediastate: Int = 0

        btnStartShow.setOnClickListener {
            viewFlipper1.flipInterval = 3500
            viewFlipper1.startFlipping()
            mediastate = 1;
            mp1.start()
            Toast.makeText(this, "Started playing Happiness by Sulton Ali", Toast.LENGTH_LONG).show()
        }
        btnStopShow.setOnClickListener {
            viewFlipper1.stopFlipping()
            mediastate = 0;
            mp1.pause();
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