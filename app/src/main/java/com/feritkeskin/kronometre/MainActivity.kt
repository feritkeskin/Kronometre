package com.feritkeskin.kronometre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import com.feritkeskin.kronometre.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val stopTime : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnStart.setOnClickListener {
            binding.kronometre.base = SystemClock.elapsedRealtime() + stopTime
            binding.kronometre.start()
            binding.btnStart.visibility = View.GONE
            binding.btnPause.visibility = View.VISIBLE
            binding.imageStart.setImageDrawable(getDrawable(R.drawable.pause))
        }
    }
}