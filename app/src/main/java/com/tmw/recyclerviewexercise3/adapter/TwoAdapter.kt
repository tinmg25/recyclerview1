package com.tmw.recyclerviewexercise3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.tmw.recyclerviewexercise3.R
import com.tmw.recyclerviewexercise3.model.TwoBlock
import kotlinx.android.synthetic.main.four_layer.view.*
import kotlinx.android.synthetic.main.two_layer.view.*
import kotlinx.android.synthetic.main.two_layer.view.imgrating

class TwoAdapter (var two:ArrayList<TwoBlock>):RecyclerView.Adapter<TwoAdapter.TwoViewHolder>(){
    class TwoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun twoBind(two:TwoBlock){
            itemView.imgbag.setImageResource(two.imageBag)
            itemView.txtname.text=two.bagName
            itemView.txtbrand.text=two.bagBrand
            itemView.imgrating.setImageResource(two.imageRate)
            itemView.txtprice.text=two.txtPrice
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwoViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.two_layer,parent,false)
        return TwoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return two.size
    }

    override fun onBindViewHolder(holder: TwoViewHolder, position: Int) {
        holder.twoBind(two[position])
    }
}