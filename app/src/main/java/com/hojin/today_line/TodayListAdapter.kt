package com.hojin.today_line

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodayListAdapter():RecyclerView.Adapter<TodayListAdapter.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val item_isChecked = view.findViewById<CheckBox>(R.id.item_checkbox)
        val item_name = view.findViewById<TextView>(R.id.item_name)
        val item_setTime = view.findViewById<ImageView>(R.id.item_clock)
        val item_textTime = view.findViewById<TextView>(R.id.item_texttime)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodayListAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_list,parent,false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: TodayListAdapter.ViewHolder, position: Int) {

        //DB에 TodayList를 모두 저장해두고 처리할 예정 -> 이후에 서버에서 TodayList를 파이어베이스메신저?등을 통해서 추가 및 삭제할 수 있도록 해보기위함
        /*holder.item_isChecked.isChecked = dataSet[position].isChecked
        holder.item_name.text = dataSet[position].name
        holder.item_textTime.text = dataSet[position].alarmtime
        holder.item_setTime.setOnClickListener {
            //시계 이미지 눌렀을때 TimePicker를 포함하는 dialogView 생성하기, default는 item_textTime.text일 껏
        }*/
    }


    override fun getItemCount(): Int {
        //return dataSet.size
        return 1
    }

}