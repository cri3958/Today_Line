package com.hojin.today_line

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_list = findViewById<Button>(R.id.main_btn_list)
        btn_list.setOnClickListener {
            val intent = Intent(this,ListActivity::class.java)
            startActivity(intent)
        }
    }
}