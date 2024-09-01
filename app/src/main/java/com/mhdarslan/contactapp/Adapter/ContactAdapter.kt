package com.mhdarslan.contactapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.mhdarslan.contactapp.Model.UserData
import com.mhdarslan.contactapp.R

class ContactAdapter(private val context: Context, private val  arrayList: ArrayList<UserData>) : ArrayAdapter<UserData>(context, R.layout.contact_item, arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view:View = convertView?:LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false)

        val img:ImageView = view.findViewById(R.id.img)
        val tv_name:TextView = view.findViewById(R.id.tv_name)
//        val tv_number:TextView = view.findViewById(R.id.tv_number)

        img.setImageResource(arrayList[position].contactsProfile)
        tv_name.text = arrayList[position].contactName
//        tv_number.text = arrayList[position].contactNumber

        return view
    }
}