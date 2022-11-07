package com.pnr.myalertsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.pnr.pnralert.PnrAlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var button: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.btn);
        button.setOnClickListener { PnrAlertDialog().alert(this@MainActivity) }
    }


}