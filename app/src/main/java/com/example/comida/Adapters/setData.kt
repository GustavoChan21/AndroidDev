package com.example.comida.Adapters

import com.example.comida.R

object setData {
// Static information about foods, pictures and their descriptions
    fun setMenus():List<Description>{
        var menuList = mutableListOf<Description>()
        menuList.add(
            Description(
                "Hamburguesa",
                "Comida Américana",
                "54.00",
                R.drawable.hamburguesa,
                "Jugosa con 225 gr. de carne Angus, sazonada con nuestra mezcla de especias y servida con lechuga, tomate, cebolla, pepinillos y mayonesa en un pan Kaiser tostado.",
                        "⬜ Carne \r\n" +
                        "⬜ Cebolla \r\n" +
                        "⬜ Pepinillos \r\n" +
                        "⬜ Mayonesa \r\n"
            )
        )
        menuList.add(
            Description(
                "Hot Dog",
                "Comida Américana",
                "18.00",
                R.drawable.hotdog,
                "Hot dog con salchicha asada, cebollita crunchy, tocino y mezcla de quesos gratinados.",
                "DADAD" +
                        "ADSAD" +
                        "ADS" +
                        "AD" +
                        "AD" +
                        "A" +
                        "D"
            )
        )
        menuList.add(
            Description(
                "Nachos con Guacamole",
                "Comida Mexicana",
                "52.00",
                R.drawable.nachos,
                "Nachos elaborados a base de tortillas de maíz acompañadas de Guacamole y pico de gallo.",
                "DADAD" +
                        "ADSAD" +
                        "ADS" +
                        "AD" +
                        "AD" +
                        "A" +
                        "D"
            )
        )
        menuList.add(
            Description(
                "Papas Fritas",
                "Comida Américana",
                "24.00",
                R.drawable.papas,
                "Crocantes y perfectas. Preparadas con nuestra clásica salsa BBQ, acompañada de otras salsas y aderezos como son: mayonesa, ketchup y/o mostaza.",
                "DADAD" +
                        "ADSAD" +
                        "ADS" +
                        "AD" +
                        "AD" +
                        "A" +
                        "D"
            )
        )
        menuList.add(
            Description(
                "Pasta",
                "Comida Italiana",
                "68.00",
                R.drawable.pasta,
                "Auténtica receta italiana preparada con la tradicional salsa de tomate, ajo y carne de cerdo, sobre una cama de pasta. Espolvoreada con queso parmesano al gusto.",
                "DADAD" +
                        "ADSAD" +
                        "ADS" +
                        "AD" +
                        "AD" +
                        "A" +
                        "D"
            )
        )
        menuList.add(
            Description(
                "Pizza",
                "Comida Américana",
                "115.00",
                R.drawable.pizza,
                "Pizza horneada y elaborada con harina de trigo, sal, agua y levadura, cubierta con salsa de tomate y otros ingredientes como queso, salami, champiñones, cebolla, jamón o aceitunas.",
                "DADAD" +
                        "ADSAD" +
                        "ADS" +
                        "AD" +
                        "AD" +
                        "A" +
                        "D"
            )
        )
        menuList.add(
            Description(
                "Quesadillas",
                "Comida Mexicana",
                "16.00",
                R.drawable.quesadilla,
                "Quesadillas a elegir entre tortillas de maíz o harina recién hechas, dobladas a la mitad y rellenas con queso manchego derretido, acompañada de carne de res, pollo o al pastor.",
                "DADAD" +
                        "ADSAD" +
                        "ADS" +
                        "AD" +
                        "AD" +
                        "A" +
                        "D"
            )
        )
        menuList.add(
            Description(
                "Ramen",
                "Comida Japonesa",
                "66.00",
                R.drawable.ramen,
                "Cuenco de sopa de fideos de trigo preparado con un caldo muy aromático y acompañado de distintos ingredientes, que se añaden a modo de toppings. Puede ser una sopa caliente o fría, con carne, pescado o vegetariana, picante o más dulce.",
                "DADAD" +
                        "ADSAD" +
                        "ADS" +
                        "AD" +
                        "AD" +
                        "A" +
                        "D"
            )
        )
        menuList.add(
            Description(
                "Sandwich",
                "Comida Americana",
                "16.00",
                R.drawable.sandwich,
                "Sandwich con pan integral o de harina con rebanadas de jamón de cerdo, queso y vegetales de tu elección como son: tomate, lechuga, cebolla, pepinillo y chile jalapeño",
                "DADAD" +
                        "dasd" +
                        "ad" +
                        "ad" +
                        "ad" +
                        "ad" +
                        "ad" +
                        "a" +
                        "d" +
                        "ad" +
                        "a" +
                        "d" +
                        "ADSAD" +
                        "ADS" +
                        "AD" +
                        "AD" +
                        "A" +
                        "D"
            )
        )
        return menuList
    }
}
