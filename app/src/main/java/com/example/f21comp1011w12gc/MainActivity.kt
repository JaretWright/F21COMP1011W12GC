package com.example.f21comp1011w12gc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.f21comp1011w12gc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var name = binding.editTextTextPersonName.text.toString()
            if (name.isNotEmpty())
                binding.textView.setText("Hello $name")
        }
    }

}