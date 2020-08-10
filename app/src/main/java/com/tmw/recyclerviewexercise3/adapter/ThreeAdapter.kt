package com.tmw.recyclerviewexercise3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tmw.recyclerviewexercise3.R
import com.tmw.recyclerviewexercise3.model.ThreeBlock
import kotlinx.android.synthetic.main.three_layer.view.*

class ThreeAdapter(var three: ArrayList<ThreeBlock>) :
    RecyclerView.Adapter<ThreeAdapter.ThreeViewHolder>() {
    class ThreeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun threeBind(three: ThreeBlock) {
            itemView.imgl3.setImageResource(three.imgCountry)
            itemView.txtl3.text = three.txtCountry

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThreeViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.three_layer, parent, false)
        return ThreeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return three.size
    }

    override fun onBindViewHolder(holder: ThreeViewHolder, position: Int) {
        holder.threeBind(three[position])
    }
}