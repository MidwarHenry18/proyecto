package com.example.appinmueble.model

import com.example.appinmueble.R


class Order(
    val id: Int = 0,
    val title: String = "",
    val total: Double = 0.0,
    val count: Int =0,
    val image: Int = 0,
    val direction : String=""
) {

    fun getOrders()  = listOf(
        Order(
            0,
            "Casa en venta",
            100.000,
            7,
            R.drawable.casa1,
            "Avenida alegria #1234"
        ),
        Order(
            1,
            "Casa en venta",
            120.000,
            10,
            R.drawable.casa3,
            "Avenida Los Geranios #35"
        ),
        Order(
            2,
            "Venta de casa",
            140.000,
            15,
            R.drawable.casa4,
            "Av. Humbolt #43"
        ),
    )
}