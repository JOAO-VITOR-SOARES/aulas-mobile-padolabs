package com.example.digitallokingpado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainTollBar = findViewById<MaterialToolbar>(R.id.mainToolbar)


        mainTollBar.setNavigationOnClickListener(){
            Toast.makeText(this,
                "Hamburger pressionado!!!",
                Toast.LENGTH_SHORT)
                    .show()

        }

        mainTollBar.setOnMenuItemClickListener{ menuItem ->
            when (menuItem.itemId)
            {
                R.id.menu_item_notifications -> {
                    Toast.makeText(
                        this,
                        "Ir para pagina de notificações",
                        Toast.LENGTH_SHORT
                    ).show()
                    true
                }

                R.id.menu_item_cart -> {
                    Toast.makeText(
                        this,
                        "Ir para pagina do carrinho",
                        Toast.LENGTH_SHORT
                    ).show()
                    true

                }
                else -> false
            }
        }
    }
}
