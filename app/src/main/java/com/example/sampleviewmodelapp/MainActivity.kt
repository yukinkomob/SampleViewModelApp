package com.example.sampleviewmodelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sampleviewmodelapp.databinding.ActivityMainBinding
import com.example.sampleviewmodelapp.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}