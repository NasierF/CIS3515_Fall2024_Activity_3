package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class TextSizeAdapter(private val context:Context, private val numbers: Array<Int>) : BaseAdapter() {

    private val nums = numbers

    override fun getCount() = numbers.size

            /*Int {
        TODO("Not yet implemented")
        //return numbers.size
    }*/

    override fun getItem(position: Int) = numbers[position]

    /*Any {
        TODO("Not yet implemented")
    }*/

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
        //return position casted
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }

}