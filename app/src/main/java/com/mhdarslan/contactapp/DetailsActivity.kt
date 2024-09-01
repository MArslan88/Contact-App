package com.mhdarslan.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.mhdarslan.contactapp.Model.UserData

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val userProfile:ImageView = findViewById(R.id.cnt_img)
        val userName:TextView = findViewById(R.id.tv_user)
        val cnt_nmbr:TextView = findViewById(R.id.cnt_nmbr)

        // get intent data
        val user = intent.getParcelableExtra<UserData>("user")

        // set intent data
        if (user != null) {
            userProfile.setImageResource(user.contactsProfile)
            userName.text = user.contactName
            cnt_nmbr.text = user.contactNumber
        }

    }
}