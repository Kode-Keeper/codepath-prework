package com.example.helloworld
//Objectives:

//A. Display customized text to show 'Hello from {name}'
    //1. add text to layout
    //2. customize size and position of text within layout
//B. Display a background with a custom color
    //1. add a background to the layout with color value in hex
//C. User can tap a button to change the color of the label
    //1. add a button to our layout
        //Get a reference to our button
        //findViewById<Button>(R.id.button)


    //2. Set up logic to know when user has tapped on button

        //use .setOnClickListener{ } kon the

    //  2a. Change the color of the text
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//This Kotlin file is where we're going to be handling our user interaction
class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        var butt = findViewById<Button>(R.id.button)
        butt.setOnClickListener{
            //Handle button tap
            //2. Change color of text
            //add log statement
            Log.i("Chris", "Tapped on button")
            //get reference to our textView
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
    }
}