package com.example.recyclerview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.R
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
        var switch:Boolean = true
        generateData()
        var adapterNews = AdapterNews(this, mList)
        button_swap.setOnClickListener {
            if(switch){
                recycler_view.layoutManager = GridLayoutManager(this, 2)
                switch = false
            } else{
                recycler_view.layoutManager = LinearLayoutManager(this)
                switch =true
            }
        }
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapterNews

            }






    private fun generateData(){
        mList.add(News("Inspector General Slams FEMA", "Homeowners are eligible for federal help",
            R.drawable.fema, "The Federal Emergency Management Agency fails to help tens of thousands of people whose homes have repeatedly flooded" +
                    "according to the Office of the Inspector General for the Department of Homeland Security"
        ))
        mList.add(News("Netflix CEO Embraces 'No Rules'", "Attributes success to unorthodox office culture",
            R.drawable.netflix, "Unlimited vaction. No dress code. No approval needed for expenses"
        ))
      mList.add(News("Covid-19 Vaccine Becomes Heated", " NC is most competitive senate race",
          R.drawable.covid, "North Carolina Democratic Senate candidate Cal Cunningham said during a debate" +
                  "that he would be hesitant to take a vaccine for COVID-19"
      ))

    }
}