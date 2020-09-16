package com.example.recyclerview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var title = intent.getStringExtra("TITLE")
        var image = intent.getIntExtra("IMAGE", 0)
        var details = intent.getStringExtra("DETAILS")


        text_view_title.text = title
        image_view.setImageResource(image)
        text_view_description.text = details

    }
}