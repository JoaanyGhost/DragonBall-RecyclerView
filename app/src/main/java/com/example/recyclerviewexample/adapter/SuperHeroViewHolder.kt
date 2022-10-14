package com.example.recyclerviewexample.adapter

import android.view.View
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewexample.SuperHero
import com.example.recyclerviewexample.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    /*
    val superHeroName = view.findViewById<TextView>(R.id.TextViewSuperHeroName)
    val superHeroRealName = view.findViewById<TextView>(R.id.TextViewSuperHeroRealNombre)
    val superHeroEmpresa = view.findViewById<TextView>(R.id.TextViewEmpresa)
    val imageSuperHero = view.findViewById<ImageView>(R.id.imageViewSuperHero)
    */


    fun PasarDatos(superHeroModel: SuperHero, onClickListener: (SuperHero) -> Unit){
        binding.TextViewSuperHeroName.text = superHeroModel.nameSuperHero
        binding.TextViewSuperHeroRealNombre.text = superHeroModel.realName
        binding.TextViewEmpresa.text = superHeroModel.publisher
        Glide.with(binding.imageViewSuperHero.context).load(superHeroModel.image).into(binding.imageViewSuperHero)

        itemView.setOnClickListener {onClickListener(superHeroModel)}

    }
}