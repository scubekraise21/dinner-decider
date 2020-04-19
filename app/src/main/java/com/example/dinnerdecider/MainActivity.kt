package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList= arrayListOf("chinese","hamburger","pizza","mc donalds","kanji")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            SelectedFood.text= foodList[randomFood]

        }

        addFoodbtn.setOnClickListener {
            val newFood=addfoodTxt.text.toString()
            foodList.add(newFood)
            addfoodTxt.text.clear()
            println(foodList)
        }


    }
}
