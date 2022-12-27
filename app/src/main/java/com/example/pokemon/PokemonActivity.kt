package com.example.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class PokemonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        val image = findViewById<ImageView>(R.id.image)
        val name = findViewById<TextView>(R.id.name)
        val level_UP = findViewById<Button>(R.id.btn_level_up)
        val percent = findViewById<TextView>(R.id.level_up_percent)

        image.setImageResource(R.drawable.image1)

        var cnt:Int = 0
        var range = (1..2)

        level_UP.setOnClickListener {
            if(range.random() == 1)
            {
                cnt++
                Toast.makeText(this, "${cnt}번째 강화 성공", Toast.LENGTH_SHORT).show()
                if(cnt == 5)
                {
                    image.setImageResource(R.drawable.image2)
                    name.text = "파이리"
                    range = (1..5/2)
                    percent.text = "강화확률 40%"
                }
                else if(cnt == 16)
                {
                    image.setImageResource(R.drawable.image3)
                    name.text = "리자드"
                    range = (1..5)
                    percent.text = "강화확률 20%"
                }
                else if(cnt == 36)
                {
                    image.setImageResource(R.drawable.image4)
                    name.text = "리자몽"
                    range = (1..10)
                    percent.text = "강화확률 10%"
                }
                else if(cnt == 40)
                {
                    image.setImageResource(R.drawable.image5)
                    name.text = "메가 리자몽Y"
                    range = (1..20)
                    percent.text = "강화확률 5%"
                }
            }
        }
    }
}