package com.mhdarslan.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mhdarslan.contactapp.Adapter.ContactAdapter
import com.mhdarslan.contactapp.Adapter.MyAdapter
import com.mhdarslan.contactapp.Model.UserData

class MainActivity : AppCompatActivity() {
    private lateinit var userArrayList: ArrayList<UserData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv_contact: RecyclerView = findViewById(R.id.rv_contact)
        val layoutManager = LinearLayoutManager(this)
        rv_contact.layoutManager = layoutManager

        val userDataList: List<UserData> = dummyData()
        val adapter = MyAdapter(this, userDataList)
        rv_contact.adapter = adapter
    }

    private fun dummyData(): List<UserData> {
        val userList = mutableListOf<UserData>()
        userList.add(UserData(R.drawable.image1, "Ayesha", "03451234567"))
        userList.add(UserData(R.drawable.image2, "Noman", "03451345537"))
        userList.add(UserData(R.drawable.image3, "Danish", "03451234237"))
        userList.add(UserData(R.drawable.image4, "Ali", "03451234234"))

        return userList
    }
}
