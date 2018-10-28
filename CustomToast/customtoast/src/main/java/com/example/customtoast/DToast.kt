package com.example.customtoast

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
//import javax.swing.text.StyleConstants.getBackground
import android.widget.LinearLayout
//import javax.swing.text.StyleConstants.getBackground
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.ShapeDrawable

class DToast {

    companion object {

        fun normal(mContext: Context, message: String, duration: Int, backColor: String, textColor: String) {
            val inflater = (mContext as Activity).layoutInflater
            val customToastroot = inflater.inflate(R.layout.toast_layout, null)

            val text = customToastroot.findViewById<TextView>(R.id.custom_toast_textView) as TextView
            val layout = customToastroot.findViewById<TextView>(R.id.main_layout) as LinearLayout
            val image = customToastroot.findViewById<ImageView>(R.id.custom_toast_imageView) as ImageView
            image.visibility = View.GONE
            val background = layout.background
            text.text = "  $message  "
            text.setTextColor(Color.parseColor(textColor))

            if (background is ShapeDrawable) {
                // cast to 'ShapeDrawable'
                background.paint.color = Color.parseColor(backColor)
            } else if (background is GradientDrawable) {
                // cast to 'GradientDrawable'
                background.setColor(Color.parseColor(backColor))
            } else if (background is ColorDrawable) {
                // alpha value may need to be set again after this call
                background.color = Color.parseColor(backColor)
            }

            val customtoast = Toast(mContext)
            customtoast.view = customToastroot
            customtoast.setGravity(Gravity.BOTTOM, 0, 80)
            customtoast.duration = duration
            customtoast.show()
        }

        fun alert(mContext: Context, message: String, duration: Int,backColor: String, textColor: String) {
            val inflater = (mContext as Activity).layoutInflater
            val customToastroot = inflater.inflate(R.layout.toast_layout, null)

            val text = customToastroot.findViewById<TextView>(R.id.custom_toast_textView) as TextView
            val layout = customToastroot.findViewById<TextView>(R.id.main_layout) as LinearLayout
            val image = customToastroot.findViewById<ImageView>(R.id.custom_toast_imageView) as ImageView
            image.setImageResource(R.mipmap.alert_icon)
            val background = layout.background
            text.text = " $message  "
            text.setTextColor(Color.parseColor(textColor))

            if (background is ShapeDrawable) {
                // cast to 'ShapeDrawable'
                background.paint.color = Color.parseColor(backColor)
            } else if (background is GradientDrawable) {
                // cast to 'GradientDrawable'
                background.setColor(Color.parseColor(backColor))
            } else if (background is ColorDrawable) {
                // alpha value may need to be set again after this call
                background.color = Color.parseColor(backColor)
            }

            val customtoast = Toast(mContext)
            customtoast.view = customToastroot
            customtoast.setGravity(Gravity.BOTTOM, 0, 80)
            customtoast.duration = duration
            customtoast.show()
        }

    }

}