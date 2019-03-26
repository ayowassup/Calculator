package com.afridha.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonNumberEvent(view: View) {
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
                clickValue += "."
            }
            buttonPlusMin.id->{
                clickValue = "-"+clickValue
            }
        }
        etShowNum.setText(clickValue)
    }
}
