package com.mhdarslan.contactapp.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mhdarslan.contactapp.DetailsActivity
import com.mhdarslan.contactapp.Model.UserData
import com.mhdarslan.contactapp.R

class MyAdapter(val context: Context, private val userData:List<UserData>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        // old pattern
//        val view:View = LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false)
//        return ViewHolder(view)

        // new pattern
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {

        // new pattern
        holder.bind(userData[position])

        // old pattern
        val user: UserData = userData[position]
//        holder.profileImage.setImageResource(user.contactsProfile)
//        holder.tv_name.text = user.contactName

        holder.itemView.setOnClickListener{
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("user", user)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return userData.size
    }

    class ViewHolder(itemview:View) : RecyclerView.ViewHolder(itemview) {

        // new pattern
        fun bind(userData: UserData) {
            val profileImage = itemView.findViewById<ImageView>(R.id.img)
            val tv_name = itemView.findViewById<TextView>(R.id.tv_name)

            profileImage.setImageResource(userData.contactsProfile)
            tv_name.text = userData.contactName
        }

        // old pattern
//        val profileImage = itemview.findViewById<ImageView>(R.id.img)
//        val tv_name = itemview.findViewById<TextView>(R.id.tv_name)
    }
}