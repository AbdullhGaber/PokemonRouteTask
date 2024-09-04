package com.example.pokemonapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pokemonapp.ui.theme.CardBackground
import com.example.pokemonapp.ui.theme.PokemonAppTheme
import com.example.pokemonapp.ui.theme.PokemonBackground
import com.example.pokemonapp.ui.theme.PokemonTypeBadge


@Composable
fun PokemonCard(
    modifier : Modifier = Modifier,
    pokemon: Pokemon
){
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = CardBackground
        )
    ){
       Row(
           modifier = Modifier.padding(horizontal = 16.dp , vertical = 8.dp).fillMaxWidth(),
           Arrangement.SpaceBetween,
           Alignment.CenterVertically
       ){
           Column{
               Text(
                   text = pokemon.name,
                   fontSize = 18.sp,
                   color = Color.White
               )

               Row(
                   verticalAlignment = Alignment.CenterVertically,
                   horizontalArrangement = Arrangement.Center
               ){
                   Text(
                       modifier = Modifier
                           .background(shape = RoundedCornerShape(20.dp), color = PokemonTypeBadge)
                           .padding(horizontal = 8.dp, vertical = 0.dp),
                       text = pokemon.type.toString().lowercase(),
                       fontSize = 14.sp,
                       color = Color.White
                   )

                   Spacer(modifier = Modifier.width(8.dp))

                   Column{
                       Row{
                           Text(text = "Attack : " , color = Color.White, fontSize = 14.sp)
                           Text(text = pokemon.attackPts.toString() , fontSize = 14.sp)
                       }
                       Row{
                           Text(text = "Defense : " , color = Color.White, fontSize = 14.sp)
                           Text(text = pokemon.defensePts.toString() , fontSize = 14.sp)
                       }
                   }
               }
           }

           Image(
               modifier = Modifier.background(shape = CircleShape , color = PokemonBackground).size(120.dp).padding(8.dp),
               painter = painterResource(id = pokemon.image),
               contentDescription = "Pokemon Image"
           )

       }
    }
}

@Composable
@Preview
fun PreviewPokemonCard(){
    PokemonAppTheme {
        PokemonCard(pokemon = pokemons[0])
    }
}