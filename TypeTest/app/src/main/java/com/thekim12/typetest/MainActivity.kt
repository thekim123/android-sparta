package com.thekim12.typetest

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickSubmit(view: View) {
        var barQ1: SeekBar = findViewById(R.id.seekbarQ1)
        var barQ2: SeekBar = findViewById(R.id.seekbarQ2)
        var barQ3: SeekBar = findViewById(R.id.seekbarQ3)
        var barQ4: SeekBar = findViewById(R.id.seekbarQ4)

        var nameEdit: EditText = findViewById(R.id.nameEditText)
        var name = nameEdit.text.toString()


        var scorePE = barQ1.progress + barQ2.progress
        var scoreSF = barQ3.progress + barQ4.progress

        var button = view as Button
        var intent = Intent(this@MainActivity, ResultActivity::class.java)
        intent.putExtra("scorePE", scorePE)
        intent.putExtra("scoreSF", scoreSF)
        intent.putExtra("name", name)
        startActivity(intent)
    }
}