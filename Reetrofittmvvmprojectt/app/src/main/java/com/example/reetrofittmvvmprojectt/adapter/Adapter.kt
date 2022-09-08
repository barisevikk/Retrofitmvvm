package com.example.reetrofittmvvmprojectt.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reetrofittmvvmprojectt.R
import com.example.reetrofittmvvmprojectt.databinding.CardtasarimBinding
import com.example.reetrofittmvvmprojectt.model.Model

class Adapter(var context: Context, var Arraylist:List<Model>):
    RecyclerView.Adapter<Adapter.rowholder>() {
    inner class rowholder(var binding:CardtasarimBinding): RecyclerView.ViewHolder(binding.root){
        var bindinggg:CardtasarimBinding
        init {
            this.bindinggg=binding

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rowholder {
        var layout= LayoutInflater.from(context)
        var layoutt:CardtasarimBinding=
            DataBindingUtil.inflate(layout, R.layout.cardtasarim,parent,false)
        return rowholder(layoutt)
    }

    override fun onBindViewHolder(holder: rowholder, position: Int) {
        var layout=Arraylist[position]
        holder.binding.textView1.text=layout.name
        holder.binding.textView2.text=layout.capital
        Glide.with(context).load(Arraylist[position].image).into(holder.binding.image)


    }

    override fun getItemCount(): Int {
        return Arraylist.size
    }

}