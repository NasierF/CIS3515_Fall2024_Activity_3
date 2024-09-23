package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context:Context, private val numbers: Array<Int>) : BaseAdapter() {

    private val nums = numbers

    override fun getCount() = numbers.size



    override fun getItem(position: Int) = numbers[position]



    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView
        if (convertView != null){
            textView = convertView as TextView //recycle view if it has already been created
        }else{
            textView = TextView(context)//for first time generating views as it is still necessary to populate the spinner for the first time
            textView.setPadding(5, 10, 0, 10)
        }
        textView.textSize = numbers[position].toFloat()//grab value at position casted to float for the text size, this is dynamic
        textView.text = numbers[position].toString()//cast to string since we are using an integer array
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //view item is selected

        return super.getDropDownView(position, convertView, parent).apply {
            //textSize = 22f
        }
    }

}