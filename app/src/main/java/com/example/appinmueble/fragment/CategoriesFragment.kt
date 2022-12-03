package com.example.appinmueble.fragment

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.appinmueble.component.card.CategoryCard
import com.example.appinmueble.model.Category

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategoriesFragment(navController: NavController) {
    val categories = Category().getCategories()
    LazyVerticalGrid(cells = GridCells.Fixed(2)){
        items(categories){
            CategoryCard(it,
                onItemClick = {

                })
        }
    }
}