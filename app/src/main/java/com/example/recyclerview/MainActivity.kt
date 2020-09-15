package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.AdapterNews
import com.example.recyclerview.models.News
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var mList:ArrayList<News> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        generateData()
        var adapterNews = AdapterNews(this, mList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapterNews
    }

    private fun generateData(){
        mList.add(News("Inspector General Slams FEMA", "Homeowners are eligible for federal help", R.drawable.fema))
        mList.add(News("Netflix CEO Embraces 'No Rules'", "Attributes success to unorthodox office culture", R.drawable.netflix))
      mList.add(News("Covid-19 Vaccine Becomes Heated", " NC is most competitive senate race", R.drawable.covid))

    }
}