package com.tmw.recyclerviewexercise3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tmw.recyclerviewexercise3.R
import com.tmw.recyclerviewexercise3.model.FourBlock
import kotlinx.android.synthetic.main.four_layer.view.*

class FourAdapter(var four:ArrayList<FourBlock>):RecyclerView.Adapter<FourAdapter.FourViewHolder>() {
    class FourViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun fourBind(four:FourBlock){
            itemView.btnNew.text=four.btnNew
            itemView.btnDiscount.text=four.btnDis
            itemView.txtProduct.text=four.txtProduct
            itemView.txtProduct1.text=four.txtProduct1
            itemView.txtBrand.text=four.txtBrand
            itemView.imgrating.setImageResource(four.imgRate)
            itemView.txtPrice.text=four.txtPrice
            itemView.txtoldprice.text=four.txtOldPrice
            itemView.imgProduct.setImageResource(four.imgProduct)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FourViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.four_layer,parent,false)
        return FourViewHolder(view)
    }

    override fun getItemCount(): Int {
        return four.size
    }

    override fun onBindViewHolder(holder: FourViewHolder, position: Int) {
        holder.fourBind(four[position])
    }
}