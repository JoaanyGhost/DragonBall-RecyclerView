package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.adapter.SuperHeroAdapter
import com.example.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()

    }

    private fun initRecyclerView(){

        val manager = LinearLayoutManager(this)

        binding.RecyclerSuperHero.layoutManager = manager
        binding.RecyclerSuperHero.adapter =
            SuperHeroAdapter(SuperHeroProvider.superHeroList) {superhero ->
                onItemSelect(
                    superhero
                )
            }

    }

    fun onItemSelect(superHero: SuperHero){
        Toast.makeText(this, superHero.nameSuperHero, Toast.LENGTH_SHORT).show()
    }
}