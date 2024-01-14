package com.exemplo.meuprimeiroapp

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.util.Log
import android.widget.TextView
import androidx.core.text.inSpans

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

        val textofinal = SpannableStringBuilder().apply {
            append(string1)
            append("\n")
            inSpans(StyleSpan(Typeface.BOLD)) {
                append(string2)
            }
            append("\n\n")
            append(string3)
            append("\n")
            inSpans(StyleSpan(Typeface.BOLD)) {
                append(string4)
            }
            append("\n\n")
            append(string5)
            append("\n")
            inSpans(StyleSpan(Typeface.BOLD)) {
                append(string6)
            }
            append("\n\n")
            append(string7)
            append("\n")
            inSpans(StyleSpan(Typeface.BOLD)) {
                append(string8)
            }
            append("\n\n")
            append(string9)
            append("\n")
            inSpans(StyleSpan(Typeface.BOLD)) {
                append(string10)
            }
        }


        PrimeiroTexto.text = textofinal
    }

}