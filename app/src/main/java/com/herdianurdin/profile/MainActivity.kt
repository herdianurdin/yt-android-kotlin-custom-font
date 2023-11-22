package com.herdianurdin.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.herdianurdin.profile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnConnect.setOnClickListener {  }
            btnFollow.setOnClickListener {  }
        }
    }
}