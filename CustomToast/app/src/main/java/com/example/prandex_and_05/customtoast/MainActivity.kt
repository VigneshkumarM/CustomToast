package com.example.prandex_and_05.customtoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.customtoast.DToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            DToast.normal(this,"Hello",Toast.LENGTH_LONG,"#000000","#ffffff")
        }

    }
}
