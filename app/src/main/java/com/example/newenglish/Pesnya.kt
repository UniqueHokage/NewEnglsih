package com.example.newenglish

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Pesnya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesnya)

    }
    fun plsound(view: View){
        val mediaPlayer = MediaPlayer.create(this, R.raw.cccatch).start()
    }
    fun stpsound(view: View){

    }
}