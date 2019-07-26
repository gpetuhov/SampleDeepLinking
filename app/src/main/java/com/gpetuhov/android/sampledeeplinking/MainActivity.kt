package com.gpetuhov.android.sampledeeplinking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This shows link if not null
        text_view.text = intent?.data?.toString() ?: "Hello World!"
    }
}
