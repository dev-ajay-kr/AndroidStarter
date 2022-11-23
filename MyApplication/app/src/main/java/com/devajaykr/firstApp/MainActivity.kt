package com.devajaykr.firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClickme= findViewById<Button>(R.id.onebut)
        val onetxt= findViewById<TextView>(R.id.onetxt)
        var var1=0

        btnClickme.text="tipo iha"
        btnClickme.setOnClickListener{
//            onetxt.text="lol click kar diya"
            var1=var1+1
            onetxt.text=var1.toString()
        }
    }
}