package com.example.shared_prefrenses

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPreference =  getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        var editor = sharedPreference.edit()
btnsave.setOnClickListener{

    editor.putString("name", ed_name.text.toString())
    editor.putString("mobile", ed_mobile.text.toString())
    editor.apply()
    Toast.makeText(applicationContext,"Data is Saved",Toast.LENGTH_SHORT).show()
}
    }

    fun share(view: View) {
        val name=ed_name.text.toString()
        val mobile=ed_mobile.text.toString()
        val at=Intent(this,newpage::class.java)
at.putExtra("name",name)
at.putExtra("mobile",mobile)
        startActivity(at)

    }
}