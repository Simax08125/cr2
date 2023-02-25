package com.example.flower

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecViewBigAdapter(val con:Context, val list2:ArrayList<RecViewBigInfo>):RecyclerView.Adapter<RecViewBigAdapter.Link>(){
    class Link(itemView:View):RecyclerView.ViewHolder(itemView) {
        val img_di:ImageView=itemView.findViewById(R.id.imageId)
        val title_di:TextView=itemView.findViewById(R.id.title)
        val text_di:TextView=itemView.findViewById(R.id.text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecViewBigAdapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.rec_view_big_item,parent,false)
        return Link(root)
    }

    override fun getItemCount(): Int {
        return list2.size
    }

    override fun onBindViewHolder(holder: RecViewBigAdapter.Link, position: Int) {
        holder.img_di.setImageResource(list2[position].imageId)
        holder.title_di.setText(list2[position].title)
        holder.text_di.setText(list2[position].text)
    }

}