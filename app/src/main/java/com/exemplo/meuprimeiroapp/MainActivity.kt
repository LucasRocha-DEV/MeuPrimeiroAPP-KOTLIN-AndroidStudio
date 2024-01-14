package com.exemplo.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val PrimeiroTexto = findViewById<TextView>(R.id.PRIMEIROTEXTO)
        val string1 = getString(R.string.titulo)
        val string2 = getString(R.string.paragrafo1)
        val string3 = getString(R.string.subtitulo1)
        val string4 = getString(R.string.paragrafo2)
        val string5 = getString(R.string.subtitulo2)
        val string6 = getString(R.string.paragrafo3)
        val string7 = getString(R.string.subtitulo3)
        val string8 = getString(R.string.paragrafo4)
        val string9 = getString(R.string.subtitulo4)
        val string10 = getString(R.string.paragrafo5)

        PrimeiroTexto.text = "$string1\n$string2\n$string3\n$string4\n$string5\n$string6\n$string7\n$string8\n$string9\n$string10"
    }

}