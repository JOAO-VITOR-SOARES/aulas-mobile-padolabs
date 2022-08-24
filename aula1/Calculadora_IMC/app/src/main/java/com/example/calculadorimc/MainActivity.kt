package com.example.calculadorimc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Masculino = findViewById<CheckBox>(R.id.Masculino)
        val Feminino = findViewById<CheckBox>(R.id.Feminino)
        val img = findViewById<ImageView>(R.id.img)
        val altura = findViewById<EditText>(R.id.altura)
        val peso = findViewById<EditText>(R.id.peso)
        val result = findViewById<TextView>(R.id.result)
        val btnOK = findViewById<Button>(R.id.button)
        var numberPeso = 0.0;
        var numberAltura = 0.0;
        var imc = 0.0;


        Feminino.setOnClickListener{
            if(Masculino.isChecked){
                Masculino.setChecked(false)
            }
        }

        Masculino.setOnClickListener{
            if(Feminino.isChecked){
                Feminino.setChecked(false)
            }
        }

        btnOK.setOnClickListener {
            if(peso.text.isEmpty() || altura.text.isEmpty()){
                result.text = "error"
            }
            else{

                numberAltura = altura.text.toString().toDouble()
                numberPeso = peso.text.toString().toDouble()
                imc = numberPeso/(numberAltura * numberAltura)
                result.text = String.format("%.2f", imc);

            }
        }
    }
}
