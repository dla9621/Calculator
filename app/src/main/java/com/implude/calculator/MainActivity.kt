package com.implude.calculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.implude.calculator.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add = findViewById<Button>(R.id.add)
        val sub = findViewById<Button>(R.id.sub)
        val mul = findViewById<Button>(R.id.mul)
        val div = findViewById<Button>(R.id.div)

        val result = findViewById<TextView>(R.id.result)
        val formula = findViewById<TextView>(R.id.formula)

        val n1 = findViewById<EditText>(R.id.num01)
        val n2 = findViewById<EditText>(R.id.num02)
        var res = 0.0


        add.setOnClickListener {
            val num1 = n1.text.toString().toDouble()
            val num2 = n2.text.toString().toDouble()
            formula.text = "$num1 + $num2"
            res = num1 + num2
            result.text = "$res"
        }

        sub.setOnClickListener {
            val num1 = n1.text.toString().toDouble()
            val num2 = n2.text.toString().toDouble()
            formula.text = "$num1 - $num2"
            res = num1 - num2
            result.text = "$res"
        }

        mul.setOnClickListener {
            val num1 = n1.text.toString().toDouble()
            val num2 = n2.text.toString().toDouble()
            formula.text = "$num1 + $num2"
            res = num1 * num2
            result.text = "$res"
        }

        div.setOnClickListener {
            val num1 = n1.text.toString().toDouble()
            val num2 = n2.text.toString().toDouble()
            formula.text = "$num1 / $num2"
            res = num1 / num2
            result.text = "$res"
        }
    }
}