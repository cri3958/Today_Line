package com.hojin.today_line

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val recyclerView = findViewById<RecyclerView>(R.id.list_recyclerview)
        val ListAdapter = TodayListAdapter()

        recyclerView.adapter = ListAdapter

    }
}