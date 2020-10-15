package com.example.lab02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

var a=0;
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun count(view: View){
        var v:TextView = findViewById<TextView>(R.id.textView)
         a++
        v.text =a.toString();
    }

    fun Minus(view: View) {
        var v:TextView = findViewById<TextView>(R.id.textView)
        a--
        v.text=a.toString()
    }
}