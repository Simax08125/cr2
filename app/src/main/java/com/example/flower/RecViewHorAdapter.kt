package com.example.flower

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecViewHorAdapter(val con:Context, val list2:ArrayList<RecViewHorInfo>):RecyclerView.Adapter<RecViewHorAdapter.Link>() {
    class Link(itemView:View):RecyclerView.ViewHolder(itemView) {
        val img_di:ImageView=itemView.findViewById(R.id.rvhimageId)
        val title_di:TextView=itemView.findViewById(R.id.rvhtitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecViewHorAdapter.Link{
        val root = LayoutInflater.from(con).inflate(R.layout.rec_view_hor_item,parent,false)
        return Link(root)
    }

    override fun getItemCount(): Int {
        return list2.size
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.img_di.setImageResource(list2[position].rvhimageId)
        holder.title_di.setText(list2[position].rvhtitle)
    }
}