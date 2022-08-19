package com.dkrepsky.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// Classe Main do nosso app.
class MainActivity : AppCompatActivity() {

    // Função executada quando o app é aberto pelo usuário.
    override fun onCreate(savedInstanceState: Bundle?) {

        // Executa o método onCreate da classe Pai
        // para que o Android inicialize outras coisas.
        super.onCreate(savedInstanceState)

        // Define o layout de tela a ser utilizado.
        setContentView(R.layout.activity_main)

        // Obtém os elementos criados no layout.
        val txtMensagem = findViewById<TextView>(R.id.txtMensagem)
        val btnOk = findViewById<Button>(R.id.btnOk)
        val editNome = findViewById<EditText>(R.id.editNome)

        // Adiciona um "listener" ao evento de onClick do botão.
        btnOk.setOnClickListener {

            // Define a mensagem de acordo com o conteúdo do input de texto.
            if(!editNome.text.isEmpty()){
                txtMensagem.setText("Olá " + editNome.text.trim() + " seja bem vindo ao mundo mobile")
            } else {
                txtMensagem.setText("Por favor, informe seu nome")
            }
        }

    }
}