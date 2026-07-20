package ders6

fun main() {
    val hamGirdi = "mERhaBa Kotlin  "

// Metotları arka arkaya (zincirleme) çağırabiliriz!
    val temizMetin = hamGirdi.trim().lowercase()

    println(temizMetin) // Çıktı: “merhaba kotlin”

    when {
        temizMetin == "merhaba kotlin" -> println("Eşleşme başarılı!")
        temizMetin.contains("merhaba") -> println("Sadece merhaba dendi")
    }

    println(temizMetin.substring(0))

    println("Adın:")
    val ad = readln().trim().lowercase()// bahar
    val temizlenmisAd = ad.replaceFirstChar { it.uppercase() }
    println(temizlenmisAd)


}