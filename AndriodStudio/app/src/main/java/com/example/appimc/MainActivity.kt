package com.example.appimc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cuadroEntradaAltura : EditText= findViewById(R.id.textAltura)
        val cuadroEntradaPeso: EditText = findViewById(R.id.textPeso)
        val buttonCalcular : Button = findViewById(R.id.buttonCalcular)
        val cuadroSalida : TextView = findViewById(R.id.salidaCalculo)
        var cuadroSalidaResultado : TextView = findViewById(R.id.textResultado)

        buttonCalcular.setOnClickListener{
           var intAltura = cuadroEntradaAltura.text.toString().toDouble()
            var intPeso = cuadroEntradaPeso.text.toString().toDouble()
            var resultado: Double = intPeso / Math.pow(intAltura.toDouble(), 2.0)
            cuadroSalidaResultado.text = resultado.toString();


            if (intAltura > 0 && intPeso > 0) {


                when  {
                    (resultado < 18.5) -> cuadroSalida.text =
                        "Usted sufre delgadez, debería comer más."+resultado

                    (resultado in 18.5..24.9) -> cuadroSalida.text = "Su estado de forma es bueno.  \n"

                    (resultado in 25.0..29.9) -> cuadroSalida.text =
                        "Usted sufre sobrepeso, debería cuidarse y llamar a un dietista."

                    (resultado >= 30) -> cuadroSalida.text =
                        "Usted sufre obesidad, debería llamar a un médico urgentemente.\n"

                    else -> {
                        cuadroSalida.text = " DATO INCORRECTO."
                    }
                }
            }

        }




    }
}