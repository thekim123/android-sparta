package com.thekim12.personalitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickIstj(view: View){
        Toast.makeText(view.context, "청렴결백한 논리주의자", Toast.LENGTH_LONG).show()
    }
}