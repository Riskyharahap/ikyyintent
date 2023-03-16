
package com.example.ikyyintent

import android.content.Intent
import android.nfc.NfcAdapter.EXTRA_DATA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity1 : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        btnIntent = findViewById(R.id.btn_intent)
        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)

        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_intent -> run{
                val intentBiasa = Intent(this@MainActivity1, MainActivity2::class.java)
                startActivity(intentBiasa)
            }
            R.id.btn_pindah_data ->run{
                val intentData = Intent(this@MainActivity1, PindahDataActivity::class.java)
                intentData.putExtra(PindahDataActivity.EXTRA_TEXT, "")
            }
        }
    }
}