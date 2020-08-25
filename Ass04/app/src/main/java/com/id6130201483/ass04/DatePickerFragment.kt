package com.id6130201483.ass04

import android.app.DatePickerDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import java.text.DateFormat
import java.util.*

class DatePickerFragment: DialogFragment(), DatePickerDialog.OnDateSetListener {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val calendar = Calendar.getInstance()

        val year = calendar.get(Calendar.YEAR)
        val mouth = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        return DatePickerDialog(activity!!, this, year, mouth, day)
    }

    override fun onDateSet(view: DatePicker?, year: Int, mouth: Int, day: Int) {
        var tv: TextView? = activity?.findViewById<TextView>(R.id.text_date)
        tv!!.text = formatDate(year,mouth,day)
    }

    override fun onCancel(dialog: DialogInterface) {
        Toast.makeText(activity, "Please select a date.", Toast.LENGTH_SHORT).show()
        super.onCancel(dialog)
    }

    private fun formatDate(year: Int, mouth: Int, day: Int): String {
        return "$day/${mouth+1}/$year"
    }
}