package com.example.barvolume

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_adders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_addres)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //inisialiasi komponen
        var edtTanggalLahir = findViewById<EditText>(R.id.edtTanggalLahir)
        var btnKlik = findViewById<Button>(R.id.btnClick)
        var tvHasil = findViewById<TextView>(R.id.tvResult)

        btnKlik.setOnClickListener {
            val input = edtTanggalLahir.text.toString()
            val hasil = when(input.toInt()){
                in 1946..1964 -> "Baby boomers"
                in 1965..1980 -> "X"
                in 1981..1995 -> "Millenial"
                in 1996..2010 -> "Z"
                else -> "Gak tau mass"
            }
            tvHasil.text = "Kamu generasi $hasil"
        }
    }
}