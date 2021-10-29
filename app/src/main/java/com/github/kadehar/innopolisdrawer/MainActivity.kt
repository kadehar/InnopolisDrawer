package com.github.kadehar.innopolisdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.kadehar.innopolisdrawer.feature.canvas.CanvasFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
            .replace(android.R.id.content, CanvasFragment.newInstance())
            .commit()
    }
}