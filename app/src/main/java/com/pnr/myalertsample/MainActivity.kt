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

    //https://in.video.search.yahoo.com/search/video?fr=mcafee&ei=UTF-8&p=library+creation+android+studio&type=E211IN826G0#id=2&vid=fd14d4d45d68bc4383f4989edba234d0&action=view
    //https://in.video.search.yahoo.com/search/video?fr=mcafee&ei=UTF-8&p=library+creation+android+studio&type=E211IN826G0#id=1&vid=4cc579222e1141b2f67c5350056eba2f&action=view

}