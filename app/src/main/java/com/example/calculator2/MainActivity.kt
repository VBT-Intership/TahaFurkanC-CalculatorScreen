package com.example.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calOne.setOnClickListener { calculate("1",false) }
        calTwo.setOnClickListener {  calculate("2",false)}
        calThree.setOnClickListener { calculate("3",false) }
        calFour.setOnClickListener {calculate("4",false)  }
        calFive.setOnClickListener { calculate("5",false) }
        calSix.setOnClickListener {  calculate("6",false)}
        calSeven.setOnClickListener { calculate("7",false) }
        calEight.setOnClickListener { calculate("8",false) }
        calNine.setOnClickListener {  calculate("9",false)}
        calZero.setOnClickListener {  calculate("0",false)}
        calSum.setOnClickListener { calculate("+",true) }
        calDot.setOnClickListener { calculate("-",true) }
        calMul.setOnClickListener { calculate("*",true) }
        calDivide.setOnClickListener { calculate("/",true) }
        calPercent.setOnClickListener { calculate("%",true) }
        calReset.setOnClickListener {
            calExpression.text=""
            calResult.text=""
        }
        calEquals.setOnClickListener {

        }
    }
    fun calculate(string: String, actionbutton: Boolean) {
        if (!actionbutton){
            calExpression.append(calResult.text)
            calExpression.append(string)
            calResult.text = ""
        }
        else{
            calResult.text=""
            calExpression.append(string)
        }
    }
}