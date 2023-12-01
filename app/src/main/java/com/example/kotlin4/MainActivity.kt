package com.example.kotlin4

import android.app.SearchManager.OnCancelListener
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {

    private lateinit var whatsapbtn: MaterialButton
    private lateinit var etInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        whatsapbtn = this.findViewById(R.id.whatsapbtn)
        etInput = this.findViewById(R.id.edtext)


        goToWhatsApp()
    }
    private fun goToWhatsApp(){
        whatsapbtn.setOnClickListener{
            val WhatsappSearchUrl = "https://wa.me/"
            val query = etInput.text.trim()
            val whatsappIntent = Intent(Intent.ACTION_VIEW, Uri.parse("$WhatsappSearchUrl$query"))
            startActivity(whatsappIntent)
        }
    }



}