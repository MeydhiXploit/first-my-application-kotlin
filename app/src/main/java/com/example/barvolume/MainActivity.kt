package com.example.barvolume

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), View.OnKeyListener, View.OnClickListener {
    private lateinit var edtWidth:EditText
    private lateinit var edtHeight:EditText
    private lateinit var edtLength:EditText
    private lateinit var btnCalculated:Button
    private lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            edtWidth = findViewById(R.id.edt_Width)
            edtHeight = findViewById(R.id.edt_Height)
            edtLength = findViewById(R.id.edt_Length)
            btnCalculated = findViewById(R.id.btn_Calculated)
            tvResult = findViewById(R.id.tv_Hasil)
            btnCalculated.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if(view?.id == R.id.btn_Calculated){
            val inputLength = edtLength.text.toString().trim()
            val inputWidth = edtWidth.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()
            val volume = inputLength.toDouble() * inputWidth.toDouble() * inputHeight.toDouble()
            tvResult.text = volume.toString()
        }
    }

    override fun onKey(p0: View?, p1: Int, p2: KeyEvent?): Boolean {
        TODO("Not yet implemented")
    }

}