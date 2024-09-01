package com.mhdarslan.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.lv_contact)

        val contactList = listOf(
            ContactModel(R.drawable.image1, "Alia"),
            ContactModel(R.drawable.image2, "Danish"),
            ContactModel(R.drawable.image3, "Noman"),
            ContactModel(R.drawable.image4, "Ali")
        )

        val contactName: List<String> = contactList.map { it.name }
        val adapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, contactName)
        listView.adapter = adapter

    }
}

data class ContactModel(val image: Int, val name: String)