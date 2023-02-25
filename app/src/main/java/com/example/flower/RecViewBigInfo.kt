package com.example.flower

data class RecViewBigInfo(val imageId:Int, val title:String, val text:String)
class RecViewBigInfoList{ val list = arrayListOf(
    RecViewBigInfo(R.drawable.icon1, "Заголовок блока", "Краткое описание\nблока с двумя строчками"),
    RecViewBigInfo(R.drawable.icon2, "Заголовок блока", "Краткое описание\nблока с двумя строчками"),
    RecViewBigInfo(R.drawable.icon3, "Заголовок блока", "Краткое описание\nблока с двумя строчками"),
    RecViewBigInfo(R.drawable.icon1, "Заголовок блока", "Краткое описание\nблока с двумя строчками"),
    RecViewBigInfo(R.drawable.icon1, "Заголовок блока", "Краткое описание\nблока с двумя строчками"),
    RecViewBigInfo(R.drawable.icon2, "Заголовок блока", "Краткое описание\nблока с двумя строчками")
)
}
