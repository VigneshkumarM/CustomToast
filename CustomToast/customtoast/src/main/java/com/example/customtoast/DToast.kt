package com.example.customtoast

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DToast {

    fun normalToast(mContext : Context, message : String)
    {
        val context = mContext
        val inflater = (mContext as Activity).layoutInflater
        val customToastroot = inflater.inflate(R.layout.toast_layout, null)

        //customToastroot.setBackgroundColor(Color.parseColor(color))
        val text = customToastroot.findViewById<TextView>(R.id.custom_toast_textView) as TextView
        text.text = "  $message  "

        val customtoast = Toast(mContext)
        customtoast.view = customToastroot
        customtoast.setGravity(Gravity.BOTTOM, 0, 80)
        customtoast.duration = Toast.LENGTH_SHORT
        customtoast.show()
    }

}