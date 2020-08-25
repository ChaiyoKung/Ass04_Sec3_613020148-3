package com.id6130201483.ass04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDatePickerDialog(v: View) {
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")
    }

    fun register(v: View) {
        var radioSelectedID = radio_gender.checkedRadioButtonId
        var radioSelected = findViewById<RadioButton>(radioSelectedID)
        text_showInfo.text =
            "Name: ${edit_user.text}\nPassword: ${edit_pass.text}\nGender: ${radioSelected.text}\nEmail: ${edit_email.text}\nBirthday: ${text_date.text}"

    }

    fun reset(v: View) {
        edit_user.text.clear()
        edit_pass.text.clear()
        radio_gender.clearCheck()
        edit_email.text.clear()
        text_date.text = "dd/mm/yyyy"
        text_showInfo.text = "Show information"
    }
}