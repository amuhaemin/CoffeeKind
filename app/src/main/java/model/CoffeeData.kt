package model

import com.example.coffeekind.MainActivity

object CoffeeData {
    private val data = arrayOf(
        arrayOf(
            "Kopi Hitam",
            "Hasil seduhan biji kopi yang telah disangrai dan dihaluskan menjadi bubuk tanpa penambahan perisa apapun.",
            "https://i.pinimg.com/736x/e0/31/f2/e031f2e90b4898c24a10c7a4a19a4357.jpg"
        ),
        arrayOf(
            "Espresso",
            "Minuman yang dihasilkan dengan mengekstraksi biji kopi yang sudah digiling dengan menyemburkan air panas di bawah tekanan tinggi. ",
            "https://upload.wikimedia.org/wikipedia/commons/4/41/Espresso_BW_1.jpg"
        ),
        arrayOf(
            "Latte",
            "Biasa dikenal dengan sebutan Caffé Latte (Bahasa Italia yang artinya Kopi Susu) adalah sebuah espresso atau kopi yang dicampur dengan susu dan memiliki lapisan busa yang tipis di atasnya.",
            "https://upload.wikimedia.org/wikipedia/commons/9/91/Caffè_latte_as_being_served_at_Kaffebrenneriet_Torshov%2C_Oslo%2C_Norway_2_600x600_100KB.jpg"
        ),
        arrayOf(
            "Café au lait",
            "Café au lait (Bahasa Prancis yang artinya kopi susu) adalah campuran kopi hitam yang tajam dengan susu panas.[1] Café au lait memiliki kesamaan dengan caffé latte tetapi café au lait menggunakan kopi hitam dan bukan espresso.",
            "https://upload.wikimedia.org/wikipedia/commons/9/9c/Café_au_lait.jpg"
        ),
        arrayOf(
            "Caffè macchiato",
            "Minuman kopi yang dibuat dengan mencampurkan espresso dengan susu.[1] Ada dua jenis macchiato yang biasanya disajikan, yaitu espresso macchiato dan latte macchiato.",
            "https://upload.wikimedia.org/wikipedia/commons/2/2b/Latte_macchiato.jpg"
        ),
        arrayOf(
            "Cappuccino",
            "Minuman khas Italia yang dibuat dari espresso dan susu, tetapi referensi lain juga ada yang menyebutkan bahwa kapucino berawal dari biji biji kopi tentara Turki yang tertinggal setelah peperangan yang di pimpin oleh Kara Mustapha Pasha di Wina, Austria melawan tentara gabungan Polandia-Germania.",
            "https://upload.wikimedia.org/wikipedia/commons/0/0f/Cappuccino_big.jpg"
        ),
        arrayOf(
            "Frappé",
            "Minuman es kopi khas Yunani yang bersalut buih, terbuat dari kopi instan, gula, air dan es.",
            "https://upload.wikimedia.org/wikipedia/commons/f/f5/Frappedia3.JPG"
        ),
        arrayOf(
            "Irish Coffee",
            "Minuman koktail yang dibuat dengan mencampurkan wiski Irlandia dengan kopi dan gula serta krim kocok diatasnya.",
            "https://upload.wikimedia.org/wikipedia/commons/9/9b/Irish_coffee1.jpg"
        ),
        arrayOf(
            "Kopi Tubruk",
            "Minuman kopi dari Indonesia yang dibuat dengan mendidihkan biji kopi bersama dengan gula. Kopi ini memiliki kesamaan dengan kopi dari Turki dan Yunani dalam hal kepekatannya.",
            "https://upload.wikimedia.org/wikipedia/commons/b/b3/Kopi_Tubruk_Jakarta.jpg"
        ),
        arrayOf(
            "Mocha",
            "Minuman kopi yang terbuat dari campuran espresso dengan coklat dan susu. Saat ini campuran Mocha-Java biasa dicampur dengan varietas lainnya untuk menciptakan ciri khas yang unik.",
            "https://upload.wikimedia.org/wikipedia/commons/7/79/Mocha.jpg"
        )
    )

    val listData: ArrayList<Coffee>
        get(){
            val list = arrayListOf<Coffee>()
            for (aData in data){
                val coffee = Coffee()
                coffee.name = aData[0]
                coffee.desc = aData[1]
                coffee.photo = aData[2]

                list.add(coffee)
            }
            return list
        }

}