package com.example.appinmueble.model

import com.example.appinmueble.R


class Category(
    val id: Int = 0,
    val category: String = "",
    val image: Int = 0,
) {

    fun getCategories()  = listOf(
        Category(
            0,
            "Casa",
            R.drawable.casa,
        ),
        Category(
            1,
            "Departamentos",
            R.drawable.depa,
        ),
        Category(
            2,
            "Local Comercial",
            R.drawable.local,
        ),
        Category(
            3,
            "Lotes",
            R.drawable.lote,
        ),
        Category(
            4,
            "Casa de Playa",
            R.drawable.csaplay,
        ),
        Category(
            5,
            "Terrenos Agrícolas",
            R.drawable.agri,
        )
    )
}