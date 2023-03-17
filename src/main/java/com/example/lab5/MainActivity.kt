package com.example.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgHome:ImageView = findViewById(R.id.imgHome)
        val imgUser:ImageView = findViewById(R.id.imgUser)
        val fragmentHome = HomeFragment()
        val fragmentUser = UserFragment()
        imgUser.setOnClickListener {
            imgHome.setImageResource(R.drawable.baseline_home_24_un)
            imgUser.setImageResource(R.drawable.baseline_people_24)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView12, fragmentUser)
                commit()
            }
        }
        imgHome.setOnClickListener {
            imgHome.setImageResource(R.drawable.baseline_home_24)
            imgUser.setImageResource(R.drawable.baseline_people_24_un)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView14,fragmentHome)
                commit()
            }
        }
    }

}

