package com.example.ejercicio_09

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroupM07 = findViewById(R.id.radioGroup) as RadioGroup
        val radioMananaM07 = findViewById(R.id.radioButto_M07_manana) as RadioButton
        val radioTardeM07 = findViewById(R.id.radioButto_M07_tarde) as RadioButton
        val radioGroupM15 = findViewById(R.id.radioGroup2) as RadioGroup
        val radioMananaM15 = findViewById(R.id.radioButto_M15_manana) as RadioButton
        val radioTardeM15 = findViewById(R.id.radioButto_M15_tarde) as RadioButton
        val radioGroupM08 = findViewById(R.id.radioGroup3) as RadioGroup
        val radioMananaM08 = findViewById(R.id.radioButto_M08_manana) as RadioButton
        val radioTardeM08 = findViewById(R.id.radioButto_M08_tarde) as RadioButton

        setupRadioGroup(radioGroupM07, radioMananaM07,radioTardeM07)
        setupRadioGroup(radioGroupM15, radioMananaM15,radioTardeM15)
        setupRadioGroup(radioGroupM08, radioMananaM08,radioTardeM08)

    }
    fun setupRadioGroup(radioGroup: RadioGroup, radioManana: RadioButton, radioTarde: RadioButton) {

        radioManana.setOnClickListener {
            radioManana.isChecked = true
            radioTarde.isChecked = false
        }

        radioTarde.setOnClickListener {
            radioManana.isChecked = false
            radioTarde.isChecked = true
        }
    }
}