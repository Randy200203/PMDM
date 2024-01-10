package com.example.contadorrandyachana

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottonSumar : Button = findViewById(R.id.button1)
        val bottonRestar : Button = findViewById(R.id.button2)
        val bottonInciar : ImageButton = findViewById(R.id.imageButton)
        val resultado : TextView = findViewById(R.id.textView1)

        bottonSumar.setOnClickListener {
            var valorActual = resultado.text.toString().toInt()
            valorActual = valorActual + 1
            resultado.text = valorActual.toString()
        }

        bottonRestar.setOnClickListener {
            var valorActual = resultado.text.toString().toInt()


            if (valorActual > 0) {
                valorActual = valorActual - 1
                resultado.text = valorActual.toString()
            } else {
                resultado.text = valorActual.toString()
            }
        }

        bottonInciar.setOnClickListener {
            var valorActual = 0
            resultado.text = valorActual.toString()
        }
    }
}