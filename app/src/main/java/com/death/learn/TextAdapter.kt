package com.death.learn

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TextAdapter(private val textItems:List<TextData>, private val itemClickListener: ItemClickListener) : RecyclerView.Adapter<TextViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        return TextViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.text_item, parent, false))
    }

    override fun getItemCount(): Int {
        return textItems.size
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.bindData(textItems[position])

        holder.addButton.setOnClickListener {
            itemClickListener.add(textItems[position], position)
        }

        holder.minusButton.setOnClickListener {
            itemClickListener.minus(textItems[position], position)
        }
    }

}