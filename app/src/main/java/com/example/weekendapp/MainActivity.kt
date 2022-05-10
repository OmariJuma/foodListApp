package com.example.weekendapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view

            data.add(ItemsViewModel(R.drawable.apple_pie, "Apple pie","Ksh 900"))
        data.add(ItemsViewModel(R.drawable.banchan, "Banchan","Ksh 1200"))
        data.add(ItemsViewModel(R.drawable.borek, "Borek","Ksh 1000"))
        data.add(ItemsViewModel(R.drawable.brusheta, "Brusheta","Ksh 1500"))
        data.add(ItemsViewModel(R.drawable.churasso, "churasso","Ksh 500"))
        data.add(ItemsViewModel(R.drawable.eclair, "eclair","Ksh 700"))
        data.add(ItemsViewModel(R.drawable.gnochi, "gnochi","Ksh 900"))
        data.add(ItemsViewModel(R.drawable.grilled_cheese, "grilled_cheese","Ksh 1300"))
        data.add(ItemsViewModel(R.drawable.macarons, "macarons","Ksh 1800"))
        data.add(ItemsViewModel(R.drawable.margarita, "margarita","Ksh 2000"))
        data.add(ItemsViewModel(R.drawable.milkshake, "milkshake","Ksh 200"))
        data.add(ItemsViewModel(R.drawable.moon_cake, "moon cake","Ksh 400"))
        data.add(ItemsViewModel(R.drawable.nougart, "nougart","Ksh 500"))
        data.add(ItemsViewModel(R.drawable.pad_thai, "pad thai","Ksh 2500"))
        data.add(ItemsViewModel(R.drawable.pavlova, "pavlova","Ksh 600"))
        data.add(ItemsViewModel(R.drawable.sarma, "Sarma","Ksh 1800"))
        data.add(ItemsViewModel(R.drawable.satay, "satay","Ksh 3000"))
        data.add(ItemsViewModel(R.drawable.spring_rolls, "spring_rolls","Ksh 450"))
        data.add(ItemsViewModel(R.drawable.yorghurt, "yoghurt","Ksh 200"))
        data.add(ItemsViewModel(R.drawable.grilled_cheese, "grilled_cheese","Ksh 1300"))
        data.add(ItemsViewModel(R.drawable.apple_pie, "Apple pie","Ksh 900"))



        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}