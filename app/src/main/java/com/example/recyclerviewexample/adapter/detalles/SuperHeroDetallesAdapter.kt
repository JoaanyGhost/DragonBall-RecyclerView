package com.example.recyclerviewexample.adapter.detalles

import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.View.inflate
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.SuperHero

class SuperHeroDetallesAdapter(private val superHeroList: List<SuperHero>, private val onClickListener: (SuperHero) -> Unit) : RecyclerView.Adapter<SuperHeroViewDetallesHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewDetallesHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewDetallesHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))

    }

    override fun onBindViewHolder(holder: SuperHeroViewDetallesHolder, position: Int) {
        val item = superHeroList[position]
        holder.PasarDatos(item, onClickListener)

    }

    override fun getItemCount(): Int = superHeroList.size



}