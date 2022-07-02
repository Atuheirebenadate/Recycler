package com.devbenadate.numbersrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class NameRecyclerViewAdapter(var num:List<Int>):RecyclerView.Adapter<NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_items,parent,false)
        return NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvView.text=num.get(position).toString()
    }

    override fun getItemCount(): Int {
        return num.size

    }
}
class NumberViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvView=itemView.findViewById<TextView>(R.id.tvView)

}