package com.death.learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ItemClickListener {

    lateinit var textAdapter: TextAdapter
    lateinit var textDataList:ArrayList<TextData>
    lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAdapterWithData()

        linearLayoutManager = LinearLayoutManager(this)

        textList.apply {
            layoutManager = linearLayoutManager
            adapter = textAdapter
        }
    }


    private fun initAdapterWithData(){
        textDataList = ArrayList();
        for(i in 1..20){
            textDataList.add(TextData("Text $i", i,0))
        }
        textAdapter = TextAdapter(textDataList, this@MainActivity);
    }

    override fun add(textData: TextData, position: Int) {
        textData.itemCount+=1
        textAdapter.notifyItemChanged(position)
    }

    override fun minus(textData: TextData, position: Int) {
        textData.itemCount-=1
        textAdapter.notifyItemChanged(position)
    }
}
