package ders6.Pratikler

fun main() {

    val dilKodu = "TR"

    val karsilamaMesaji = when (dilKodu) {
        "TR" -> "Merhaba"
        "EN" -> "Hello"
        "ES" -> "Hola"
        "FR" -> "Bonjour"
        else -> "Bilinmeyen Dil / Unknown Language"
    }

    println("Seçilen dil için mesaj: $karsilamaMesaji")


}