package com.example.ikyyintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahDataActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_TEXT = "extra text"
    }

    private lateinit var tvPenerima : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data)


        tvPenerima = findViewById(R.id.tv_terimadata)

        val tvReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = "Text Yang Di kirim : $tvReceived"

        tvPenerima.text = text
    }

}