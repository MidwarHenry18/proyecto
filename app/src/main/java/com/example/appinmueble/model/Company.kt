package com.example.appinmueble.model

import com.example.appinmueble.R


class Company(
    val id: Int = 0,
    val name: String = "",
    val description : String="",
    val deliveryPrice: String = "",
    val deliveryTime: String = "",
    val rating: String = "",
    val image : Int =0,
    val products : List<Product> =listOf()
) {

    fun getCompanies()  = listOf(
        Company(
            0,
            "Departamento",
            "Excelente ubicación, paralela a la Av. Metropolitana, espalda de la posta medica de San Carlos, a 1 cdra. de colegios y un parque, a 5 minutos del Ovalo Santa Anita. Área Construida: 85 m2. El departamento consta de: Sala comedor, cocina, 1 baño completo, 2 habitaciones y un área común de 20 m2. en la azotea para tendedero y lavandería .",
            "300.000",
            "45-55 min",
            "S/. 300.000",
            R.drawable.depa1,
            listOf(
                Product(
                    0,
                    "85m2 Área de terreno",
                    200.0,
                    R.drawable.iconcasa,
                    true

                ),
                Product(
                    1,
                    " 2 Dormitorios",
                    500.0,
                    R.drawable.iconcasa,
                    false
                ),
                Product(
                    2,
                    "10 años de construcción",
                    250.0,
                    R.drawable.iconcasa,
                    false
                ),
            )
        ),
        Company(
            1,
            "Departamento",
            "Acogedor Mini-Departamento en 1er piso, ingreso con puerta de vidrio 10\" templado.\n" +
                    "Ingreso a departamento con puerta de madera, sala, comedor con kitchenette con campana extractora, con muebles altos y bajos, lavandería, baño con Jacuzzi, Terma, rejas de seguridad, ventanas anti ruido, intercomunicador, ascensor, deposito en el departamento y deposito en la cochera. A 1 cdra. del malecón con linda vista al mar, lejos del ruido.\n" +
                    "A 2 cdras. de la Av. el Ejercito, buses y movilidad a toda hora.",
            "200.000",
            "Tacna",
            "S/. 200.000",
            R.drawable.depa2,
            listOf(
                Product(
                    0,
                    " 1er Piso + Cochera",
                    200.0,
                    R.drawable.iconcasa,
                    false

                ),
                Product(
                    1,
                    "Cocina amoblada",
                    500.0,
                    R.drawable.iconcasa,
                    true
                ),
                Product(
                    2,
                    "3 habitaciones y 2 baños",
                    250.0,
                    R.drawable.iconcasa,
                    false
                ),
            )
        ),
        Company(
            2,
            "Amplia Casa",
            "A 2 cuadras de la Av. Pachacutec\n" +
                    "Altura por Tottus de Pachacutec, grifo las conchitas,\n" +
                    "A 5 min del tren eléctrico de Villa el Salvador. La zona cuenta con Comercios (Restaurantes, Hoteles, Mercados, Farmacia, posta médica, Colegios, grifo, loza deportiva)",
            "400.000",
            "Lima",
            "S/. 400.000",
            R.drawable.depa3,
            listOf(
                Product(
                    0,
                    "4 Baños",
                    200.0,
                    R.drawable.iconcasa,
                    true

                ),
                Product(
                    1,
                    "8 Dormitorios",
                    500.0,
                    R.drawable.iconcasa,
                    true
                ),
                Product(
                    2,
                    "300 m² Techada",
                    250.0,
                    R.drawable.iconcasa,
                    false
                ),
            )
        ),
        Company(
            3,
            "Casa",
            "Se oferta Predio de 333m2 (frentera de 10m) con muy buena ubicación, en plena Avenida Celestino Vargas, cerca al Ovalo de Pocollay.\n" +
                    "Se cuenta con título inscrito en Registros Públicos. Se vende a 420 dólares el m2.\n" +
                    "De tener interés de compra, comuníquese para mayor información y/o acordar su visita.",

            "518.000",
            "Tacna",
            "S/. 518.000",
            R.drawable.depa4,
            listOf(
                Product(
                    0,
                    "2 Baños",
                    200.0,
                    R.drawable.iconcasa,
                    false

                ),
                Product(
                    1,
                    "3 habitaciones",
                    500.0,
                    R.drawable.iconcasa,
                    false
                ),
                Product(
                    2,
                    "Garaje",
                    250.0,
                    R.drawable.iconcasa,
                    true
                ),
            )
        ),
        Company(
            4,
            "Casa",
            "CASA DE DOS PISOS, TRES DORMITORIOS CON 2 BAÑOS, CUARTO Y BAÑO DE SERVICIO. CUENTA CON COCHERA HASTA DOS VEHICULOS. PASADIZO QUE UNE EL INGRESO CON EL PATIO POSTERIOR. PISOS, CLOSET Y REPOSTEROS DE MADERA. CUANTA CON ESTUDIO EN PRIMER NIVEL Y SALA DE ESTAR SEGUNDO PISO. LAVANDERIA EN TRECER PISO.",
            "770.000",
            "Tacna",
            "S/. 770.000",
            R.drawable.depa5,
            listOf(
                Product(
                    0,
                    "2 baños",
                    200.0,
                    R.drawable.iconcasa,
                    false

                ),
                Product(
                    1,
                    "3 dormitorios",
                    500.0,
                    R.drawable.iconcasa,
                    true
                ),
                Product(
                    2,
                    "Cocina amplia",
                    250.0,
                    R.drawable.iconcasa,
                    false
                ),
            )
        )
    )
}