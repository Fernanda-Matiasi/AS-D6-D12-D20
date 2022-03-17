package com.example.dadinho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        buttonD6.setOnClickListener {
            rolarDados1(6)
        }

        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        buttonD12.setOnClickListener {
            rolarDados2(12)
        }

        val buttonD20 = findViewById<Button>(R.id.buttonD20)
        buttonD20.setOnClickListener {
            rolarDados3(20)
        }
    }

    fun rolarDados1(lados: Int){
        val valor = (1..lados).random()

        val textD6 = findViewById<TextView>(R.id.textD6)
        textD6.text = valor.toString()

        val imageResource = imgD6(valor)
        val imageD6 = findViewById<ImageView>(R.id.imageD6)
        imageD6.setImageResource(imageResource)
    }

    private fun imgD6(valor: Int): Int {
        return when(valor){
            1 -> R.drawable.dado1
            2 -> R.drawable.dado2
            3 -> R.drawable.dado3
            4 -> R.drawable.dado4
            5 -> R.drawable.dado5
            else -> R.drawable.dado6

        }
    }


    fun rolarDados2(lados: Int){
        val valor = (1..lados).random()

        val textD12 = findViewById<TextView>(R.id.textD12)
        textD12.text = valor.toString()

        val imageResource = imgD12(valor)
        val imageD12 = findViewById<ImageView>(R.id.imageD12)
        imageD12.setImageResource(imageResource)
    }

    private fun imgD12(valor: Int): Int {
        return when(valor){
            1 -> R.drawable.d12_1
            2 -> R.drawable.d12_2
            3 -> R.drawable.d12_3
            4 -> R.drawable.d12_4
            5 -> R.drawable.d12_5
            6 -> R.drawable.d12_6
            7-> R.drawable.d12_7
            8 -> R.drawable.d12_8
            9 -> R.drawable.d12_9
            10 -> R.drawable.d12_10
            11 -> R.drawable.d12_11
            else -> R.drawable.d12_12
        }
    }


    fun rolarDados3(lados: Int){
        val valor = (1..lados).random()

        val textD20 = findViewById<TextView>(R.id.textD20)
        textD20.text = valor.toString()

        val imageResource = imgD20(valor)
        val imageD20 = findViewById<ImageView>(R.id.imageD20)
        imageD20.setImageResource(imageResource)
    }

    private fun imgD20(valor: Int): Int {
        return when(valor){
            1 -> R.drawable.d20_1
            2 -> R.drawable.d20_2
            3 -> R.drawable.d20_3
            4 -> R.drawable.d20_4
            5 -> R.drawable.d20_5
            6 -> R.drawable.d20_6
            7 -> R.drawable.d20_7
            8 -> R.drawable.d20_8
            9 -> R.drawable.d20_9
            10 -> R.drawable.d20_10
            11-> R.drawable.d20_11
            12 -> R.drawable.d20_12
            13 -> R.drawable.d20_13
            14 -> R.drawable.d20_14
            15 -> R.drawable.d20_15
            16-> R.drawable.d20_16
            17 -> R.drawable.d20_17
            18 -> R.drawable.d20_18
            19 -> R.drawable.d20_19
            else -> R.drawable.d20_20
        }
    }
}