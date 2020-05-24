package com.death.learn

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TextViewHolder(view:View):RecyclerView.ViewHolder(view){

    private val textView:TextView = view.findViewById(R.id.stringText)
    private val countText:TextView = view.findViewById(R.id.itemCount)
    val addButton:TextView = view.findViewById(R.id.add)
    val minusButton:TextView = view.findViewById(R.id.minus)

    fun bindData(textData:TextData){
        textView.text = textData.text;
        countText.text = "${textData.itemCount}"
    }

}