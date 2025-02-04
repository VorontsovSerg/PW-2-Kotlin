package com.example.pw2kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pw2kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, Fragment1())
            .commit()
    }
}
