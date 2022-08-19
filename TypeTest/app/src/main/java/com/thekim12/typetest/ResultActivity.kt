package com.thekim12.typetest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var name = intent.getStringExtra("name")

        var scorePE = intent.getIntExtra("scorePE", -1)
        var scoreSF = intent.getIntExtra("scoreSF", -1)

        var typeTextView: TextView = findViewById(R.id.resultTextView)
        typeTextView.text = showType(scorePE, scoreSF)

        var nameTextView: TextView = findViewById(R.id.nameTextView)
        nameTextView.text = name
    }

    fun showType(pe: Int, sf: Int) : String {
        var resultPE = "E"
        var resultSF = "F"

        if (pe > 5) {
            resultPE = "P"
        }

        if (sf > 5) {
            resultSF = "S"
        }

        var result = resultPE + resultSF
        return result

    }
}