package com.example.flower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class main2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recviewvert:RecyclerView=findViewById((R.id.rec_view_vert))
        recviewvert.adapter=RecViewBigAdapter(this, RecViewBigInfoList().list)
        val recviewhor:RecyclerView=findViewById((R.id.rec_view_hor))
        recviewhor.adapter=RecViewHorAdapter(this,RecViewInfoList().list)
    }

}