package com.example.cohabit1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConnexionActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connexion)
        val addButton = findViewById<Button>(R.id.button_noCompte)
        addButton.setOnClickListener {
            val intent = Intent(this, CreationCompteActivity::class.java)
            startActivity(intent)
        }
    }
    
}
