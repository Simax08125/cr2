package com.example.flower

data class RecViewHorInfo(val rvhimageId:Int, val rvhtitle:String)
class RecViewInfoList{val list = arrayListOf(
    RecViewHorInfo(R.drawable.recimg2, "Спокойным"),
    RecViewHorInfo(R.drawable.recimg3, "Расслабленным"),
    RecViewHorInfo(R.drawable.recimg1, "Задумчивым"),
    RecViewHorInfo(R.drawable.recimg2, "Взволнованным"))}
