package com.mhdarslan.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val userProfile:ImageView = findViewById(R.id.cnt_img)
        val userName:TextView = findViewById(R.id.tv_user)
        val cnt_nmbr:TextView = findViewById(R.id.cnt_nmbr)

        // get intent data
        val userProfileImage = intent.getIntExtra("profileImage", R.drawable.image1)
        val user_name = intent.getStringExtra("name")
        val user_number = intent.getStringExtra("number")

        // set intent data
        userProfile.setImageResource(userProfileImage)
        userName.text = user_name
        cnt_nmbr.text = user_number

    }
}