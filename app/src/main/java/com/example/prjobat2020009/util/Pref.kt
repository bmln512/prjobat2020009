package com.example.prjobat2020009.util

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class Pref(activity: Activity) {
    private var sp : SharedPreferences?=null
    private var login : "Login"

            init {
                sp =activity.getPreferences("Mypref", Context.MODE_PRIVATE)
            }
    fun setIsLogin(value:Boolean){
        sp!!.edit().putBoolean(Login.value).apply()
    }

    fun getIsLogin():Boolean{
        return sp!!.getBoolean(Login, False)
    }
}