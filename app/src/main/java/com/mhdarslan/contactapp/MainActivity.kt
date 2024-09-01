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

//        val listView: ListView = findViewById(R.id.lv_contact)
        val rv_contact: RecyclerView = findViewById(R.id.rv_contact)
        val layoutManager = LinearLayoutManager(this)
        rv_contact.layoutManager = layoutManager

        val userDataList: List<UserData> = dummyData()
        val adapter = MyAdapter(this, userDataList)
        rv_contact.adapter = adapter

//        val contactProfileImage: IntArray = intArrayOf(
//            R.drawable.image1,
//            R.drawable.image2,
//            R.drawable.image3,
//            R.drawable.image4
//        )
//
//        val contactName: Array<String> = arrayOf(
//            "Ayesha",
//            "Danish",
//            "Noman",
//            "Ali"
//        )
//        val contactNumber: Array<String> = arrayOf(
//            "03451234567",
//            "03001234567",
//            "03331234567",
//            "03421234567"
//        )
//        userArrayList = ArrayList()
//
//        for (position in contactName.indices) {
//            val contact = UserData(
//                contactProfileImage[position],
//                contactName[position],
//                contactNumber[position]
//            )
//            userArrayList.add(contact)
//        }

//        listView.adapter = ContactAdapter(this, userArrayList)
//        listView.isClickable = true
//        listView.setOnItemClickListener { parent, view, position, id ->
//            val userData = UserData(
//                contactProfileImage[position],
//                contactName[position],
//                contactNumber[position]
//            )
//
//            val intent = Intent(this, DetailsActivity::class.java)
//            intent.putExtra("user", userData)
//            startActivity(intent)
//        }
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
