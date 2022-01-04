package com.hojin.today_line

data class TodayList (
    val isChecked:Boolean,
    val name:String,
    val description:String = "",
    val alarmtime:String
)