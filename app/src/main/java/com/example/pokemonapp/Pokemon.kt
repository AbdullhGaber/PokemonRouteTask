package com.example.pokemonapp

import androidx.annotation.DrawableRes

data class Pokemon(
    val name : String,
   @DrawableRes val image : Int,
   val attackPts : Int,
   val defensePts : Int,
   val type : PokemonType
)

enum class PokemonType{ GRASS, FIRE, WATER }

val pokemons = listOf(
    Pokemon("Bulbasaur", image = R.drawable.bulbasaur, attackPts = 65, defensePts = 65, type = PokemonType.GRASS),
    Pokemon("Ivysaur", image = R.drawable.ivysaur, attackPts = 80, defensePts = 80, type = PokemonType.GRASS),
    Pokemon("Venusaur", image = R.drawable.venusaur, attackPts = 122, defensePts = 120, type = PokemonType.GRASS),
    Pokemon("Charmander", image = R.drawable.charmander, attackPts = 60, defensePts = 50, type = PokemonType.FIRE),
    Pokemon("Charmeleon", image = R.drawable.charmeleon, attackPts = 80, defensePts = 65, type = PokemonType.FIRE),
    Pokemon("Charizard", image = R.drawable.charizard, attackPts = 159, defensePts = 115, type = PokemonType.FIRE),
    Pokemon("Squirtle", image = R.drawable.squirtle, attackPts = 50, defensePts = 64, type = PokemonType.WATER),
    Pokemon("Wartortle", image = R.drawable.wartortle, attackPts = 65, defensePts = 80, type = PokemonType.WATER),
    Pokemon("Blastoise", image = R.drawable.blastoise, attackPts = 135, defensePts = 115, type = PokemonType.WATER)
)