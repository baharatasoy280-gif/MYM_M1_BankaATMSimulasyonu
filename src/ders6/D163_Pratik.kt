package ders6

fun main() {

    val can = 100

    when (can) {
        0 -> println("Karakter öldü. Oyun Bitti!")
        1, 2, 3 -> println("Kritik Seviye! Hemen iksir için!")
        in 4..50 -> println("Tehlikedesiniz, savunmada kalın")
        in 51..100 -> println("Sağlığınız yerinde, savaşa devam")
        else -> println("Geçersiz Değer")
    }


}

