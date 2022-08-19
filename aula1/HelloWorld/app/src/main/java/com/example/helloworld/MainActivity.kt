package com.example.helloworld
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNome = findViewById<EditText>(R.id.editNome)
        val txtMsg = findViewById<TextView>(R.id.txtMsg)
        val btnOK = findViewById<Button>(R.id.btnOK)

        btnOK.setOnClickListener {
            if(editNome.text.isEmpty()){
                txtMsg.text = "Por favor, informe seu nome!!"
            }
            else{
                txtMsg.text = "Olá "+editNome.text.trim() + ", seja bem vindo ao mundo mobile"
            }
        }
    }
}
