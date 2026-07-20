package ders6.Pratikler

fun main() {


    val gelenVeri: Any =true

    when (gelenVeri) {
        is String -> println("Metin uzunluğu: ${gelenVeri.length}")
        is Int -> println("Sayının 10 katı: ${gelenVeri*10}")
        is Boolean -> {
            if (gelenVeri == true) {
                println("Durum:Doğru")
            }else{
                println("Durum:Yanlış")
            }
        }

        else -> println("Desteklenemeyen veri tipi: ${gelenVeri}")

    }




}