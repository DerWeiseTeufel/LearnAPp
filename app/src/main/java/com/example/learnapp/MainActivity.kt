package com.example.learnapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learnapp.ui.theme.LearnAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learn_card)
        val word_str = findViewById<TextView>(R.id.word_text_view)
        val start_btn = findViewById<Button>(R.id.start_btn)

        val test_btn = findViewById<Button>(R.id.test_btn)
        val next_btn = findViewById<Button>(R.id.next_btn)
        next_btn.setOnClickListener {  word_str.text = getNewWord()}
        start_btn.setOnClickListener {
            next_btn.visibility = View.VISIBLE
            start_btn.visibility = View.INVISIBLE
            word_str.text = getNewWord()
            test_btn.visibility=View.VISIBLE
            // val modl = getModel("/Users/rukhasa/Desktop/Me/Thesis/Practice/Models/mvit32-2.pt")
        }
        test_btn.setOnClickListener {
            //val Intent_ = Intent(this, camera_activity::class.java)
            val Intent_ = Intent(this, Main2Activity::class.java)
            startActivity(Intent_)




            // Request camera permissions


            // Set up the listeners for take photo and video capture buttons

        }


    }





    private fun getNewWord(): String {
        return Vocab.get(indexofword++)
    }




    private var indexofword :Int = 0
    private val Vocab = listOf("love", "happiness", "anger")



}
