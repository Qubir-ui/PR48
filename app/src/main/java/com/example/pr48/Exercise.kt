package com.example.pr48

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Exercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
        Log.v("TAG", "арбуз")
        var num = -1
        val pictures = listOf(R.drawable.kulis, R.drawable.moth, R.drawable.artist,
            R.drawable.curtain, R.drawable.shooter, R.drawable.viy)
        val  exText= resources.getStringArray(R.array.exercises)
        num = (0..5).random()
        findViewById<ImageView>(R.id.pict).setImageResource(pictures[num])
        findViewById<TextView>(R.id.exercText).text = exText[num]
        findViewById<Button>(R.id.ok).setOnClickListener {
            finish()
        }
    }
}