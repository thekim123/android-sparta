package com.thekim12.personalitytype

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    private lateinit var personalKeyTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        personalKeyTextView = findViewById(R.id.personalKeyTextView)
        var personalKey = intent.getStringExtra("PersonalKey")
        personalKeyTextView.text = personalKey

        var myWebView: WebView = findViewById(R.id.webview)
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://www.google.com/search?q="+personalKey)
    }



}