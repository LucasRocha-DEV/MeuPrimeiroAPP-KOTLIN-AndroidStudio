package com.exemplo.meuprimeiroapp

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.widget.TextView
import androidx.core.text.inSpans

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val PrimeiroTexto = findViewById<TextView>(R.id.PRIMEIROTEXTO)

        val strings = listOf(
            Pair(R.string.titulo, R.color.titulo),
            Pair(R.string.paragrafo1, R.color.paragrafo),
            Pair(R.string.subtitulo1, R.color.subtitulo),
            Pair(R.string.paragrafo2, R.color.paragrafo),
            Pair(R.string.subtitulo2, R.color.subtitulo),
            Pair(R.string.paragrafo3, R.color.paragrafo),
            Pair(R.string.subtitulo3, R.color.subtitulo),
            Pair(R.string.paragrafo4, R.color.paragrafo),
            Pair(R.string.subtitulo4, R.color.subtitulo),
            Pair(R.string.paragrafo5, R.color.paragrafo)
        )

        val textofinal = SpannableStringBuilder().apply {
            for ((stringId, colorId) in strings) {
                inSpans(StyleSpan(Typeface.BOLD), ForegroundColorSpan(getColor(colorId))) {
                    append(getString(stringId))
                }
                if (stringId in listOf(R.string.paragrafo1, R.string.paragrafo2, R.string.paragrafo3, R.string.paragrafo4, R.string.paragrafo5)) {
                    append("\n\n")
                } else {
                    append("\n")
                }
            }
        }

        PrimeiroTexto.text = textofinal
    }
}