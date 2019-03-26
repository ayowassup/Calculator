package com.afridha.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var operator = "*"
    var oldNum = ""
    var isNewOp = true
    var dec = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonNumberEvent(view: View) {
        if(isNewOp){
            etShowNum.setText("")
        }
        isNewOp = false
        val buttonSelect = view as Button
        var clickValue:String = etShowNum.text.toString()
        when(buttonSelect.id) {
            button0.id->{
                clickValue += "0"
            }
            button1.id->{
                clickValue += "1"
            }
            button2.id->{
                clickValue += "2"
            }
            button3.id->{
                clickValue += "3"
            }
            button4.id->{
                clickValue += "4"
            }
            button5.id->{
                clickValue += "5"
            }
            button6.id->{
                clickValue += "6"
            }
            button7.id->{
                clickValue += "7"
            }
            button8.id->{
                clickValue += "8"
            }
            button9.id->{
                clickValue += "9"
            }
            buttonDot.id->{
                if (dec) {
                    //do nothing
                } else {
                    clickValue += "."
                    dec = true
                }
            }
            buttonPlusMin.id->{
                clickValue = "-"+clickValue
            }
        }
        etShowNum.setText(clickValue)
    }

    fun buttonOperation(view: View) {
        val buttonSelect = view as Button
        when (buttonSelect.id) {
            buttonDivider.id->{
                operator = "/"
                dec = false
            }
            buttonMultiple.id-> {
                operator = "*"
                dec = false
            }
            buttonSubtract.id->{
                operator = "-"
                dec = false
            }
            buttonSum.id->{
                operator = "+"
                dec = false
            }
        }
        oldNum = etShowNum.text.toString()
        isNewOp = true
    }

    fun buttonEqual(view: View){
        val newNum = etShowNum.text.toString()
        var finalNumber:Double? = null
        when(operator){
            "*"->{
                finalNumber = oldNum.toDouble() * newNum.toDouble()
            }
            "+"->{
                finalNumber = oldNum.toDouble() + newNum.toDouble()
            }
            "-"->{
                finalNumber = oldNum.toDouble() - newNum.toDouble()
            }
            "/"->{
                finalNumber = oldNum.toDouble() / newNum.toDouble()
            }
        }
        etShowNum.setText(finalNumber.toString())
        isNewOp = true
    }

    fun buttonPercent(view: View){
        val number = etShowNum.text.toString().toDouble()/100
        etShowNum.setText(number.toString())
    }

    fun buttonClean(view: View){
        etShowNum.setText("0")
        isNewOp = true
    }
}
