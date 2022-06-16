package com.example.callback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun onClick(view: View){
        val i = Intent()
        i.putExtra("key1", "Получи")
        i.putExtra("key2", " гранату!")
        setResult(RESULT_OK, i)
        finish()
    }
}