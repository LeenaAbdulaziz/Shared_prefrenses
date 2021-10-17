package com.example.shared_prefrenses

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_newpage.*

class newpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newpage)
        val sharedPreference =  getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        val name=intent.getStringExtra("name")
        val mobile=intent.getStringExtra("mobile")
        textView.setText("$name \n $mobile")
         button.setOnClickListener{
           val name=  sharedPreference.getString("name","")
           val mobile =sharedPreference.getString("mobile","")
Toast.makeText(applicationContext,"$name $mobile",Toast.LENGTH_SHORT).show()

         }
    }
}