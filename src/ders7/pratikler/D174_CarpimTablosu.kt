package ders7.pratikler

fun main() {

    print("1 ile 10 arasında bir sayı giriniz:")

    val sayi = readln().toIntOrNull()

    if (sayi != null) {
        println("$sayi sayısının çarpım tablosu:")
        for (i in 1..10) {
            val sonuc = sayi * i
            println("$sayi * $i = $sonuc")
        }

    } else {

        println("HATA: Lütfen sadece rakam giriniz!")
    }


}