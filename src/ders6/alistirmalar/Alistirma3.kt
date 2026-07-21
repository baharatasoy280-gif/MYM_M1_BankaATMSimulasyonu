package ders6.alistirmalar

fun main() {
    val gelenVeri: Any = 5

    when (gelenVeri) {
        is String -> {
            print("Metin uzunluğu gelen veri:${gelenVeri}")
        }

        is Int -> {
            print("Sayının 10 katı:${gelenVeri * 10}")
        }

        is Boolean -> {
            val durumMesaji = if (gelenVeri) "Doğru " else "Yanlış"
            print("Durum: $durumMesaji")
        }
    }


}