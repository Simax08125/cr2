package com.example.flower

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class login : AppCompatActivity() {
    lateinit var mail:EditText
    lateinit var pass:EditText

    val patterns=("[a-z]{1,100}" +"@"+"[a-z]{1,6}"+"\\."+"[a-z]{1,3}")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mail=findViewById(R.id.editTextTextPersonName)
        pass=findViewById(R.id.editTextTextPersonName2)
    }

    fun emailValid(text:String):Boolean
    {
        return Pattern.compile(patterns).matcher(text).matches()}

    fun log(view: View) {
        if(mail.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty()) {
            if (emailValid(mail.text.toString())) {

                val intent = Intent(this@login, main2::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "email error", Toast.LENGTH_SHORT).show()
            }
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Заполните поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }
}