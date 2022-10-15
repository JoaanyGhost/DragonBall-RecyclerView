package com.example.recyclerviewexample.adapter.detalles

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewexample.SuperHero
import com.example.recyclerviewexample.databinding.ItemSuperheroBinding

class SuperHeroViewDetallesHolder(view: View): RecyclerView.ViewHolder(view) {

    val bindingDetalles = ItemSuperheroBinding.bind(view)

    /*
    val superHeroName = view.findViewById<TextView>(R.id.TextViewSuperHeroName)
    val superHeroRealName = view.findViewById<TextView>(R.id.TextViewSuperHeroRealNombre)
    val superHeroEmpresa = view.findViewById<TextView>(R.id.TextViewEmpresa)
    val imageSuperHero = view.findViewById<ImageView>(R.id.imageViewSuperHero)
    */


    fun PasarDatos(superHeroModel: SuperHero, onClickListener: (SuperHero) -> Unit){

        bindingDetalles.TextViewSuperHeroName.text = superHeroModel.nameSuperHero


        bindingDetalles.TextViewSuperHeroRealNombre.text = superHeroModel.realName
        bindingDetalles.TextViewEmpresa.text = superHeroModel.publisher
        Glide.with(bindingDetalles.imageViewSuperHero.context).load(superHeroModel.image).into(bindingDetalles.imageViewSuperHero)

        itemView.setOnClickListener {onClickListener(superHeroModel)}

    }
}