package com.example.calculatorapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val clear : ImageView = findViewById(R.id.btn_ac)
        val inputText : TextView = findViewById(R.id.ipText)
        val outputText : TextView = findViewById(R.id.opText)
        val zero:ImageView=findViewById(R.id.btn_0)
        val one:ImageView=findViewById(R.id.btn_1)
        val two:ImageView=findViewById(R.id.btn_2)
        val three:ImageView=findViewById(R.id.btn_3)
        val four:ImageView=findViewById(R.id.btn_4)
        val five:ImageView=findViewById(R.id.btn_5)
        val six:ImageView=findViewById(R.id.btn_6)
        val seven:ImageView=findViewById(R.id.btn_7)
        val eight:ImageView=findViewById(R.id.btn_8)
        val nine:ImageView=findViewById(R.id.btn_9)
        val dot:ImageView=findViewById(R.id.btn_dot)
        val plus:ImageView=findViewById(R.id.btn_plus)
        val minus:ImageView=findViewById(R.id.btn_min)
        val mul:ImageView=findViewById(R.id.btn_mul)
        val div:ImageView=findViewById(R.id.btn_divide)
        val equal:ImageView=findViewById(R.id.btn_eq)
        val sbracket:ImageView=findViewById(R.id.btn_sbracket)
        val ebracket:ImageView=findViewById(R.id.btn_ebracket)




        clear.setOnClickListener {
            inputText.text=""
            outputText.text=""
        }

        zero.setOnClickListener {
            inputText.append("0")
        }
        one.setOnClickListener {
            inputText.append("1")
        }
        two.setOnClickListener {
            inputText.append("2")
        }
        three.setOnClickListener {
            inputText.append("3")
        }
        four.setOnClickListener {
            inputText.append("4")
        }
        five.setOnClickListener {
            inputText.append("5")
        }
        six.setOnClickListener {
            inputText.append("6")
        }
        seven.setOnClickListener {
            inputText.append("7")
        }
        eight.setOnClickListener {
            inputText.append("8")
        }
        nine.setOnClickListener {
            inputText.append("9")
        }
        plus.setOnClickListener {
            inputText.append("+")
        }
        minus.setOnClickListener {
            inputText.append("-")
        }
        mul.setOnClickListener {
            inputText.append("*")
        }
        dot.setOnClickListener {
            inputText.append(".")
        }
        div.setOnClickListener {
            inputText.append("/")
        }
        sbracket.setOnClickListener {
            inputText.append("(")
        }
        ebracket.setOnClickListener {
            inputText.append(")")
        }
        equal.setOnClickListener {
            val expression=ExpressionBuilder(inputText.text.toString()).build()
            val result=expression.evaluate()
            val longResult=result.toLong()
            if(result==longResult.toDouble())
            {
                outputText.text=longResult.toString()
            }
            else
            {
                outputText.text=result.toString()
            }
        }


    }

}