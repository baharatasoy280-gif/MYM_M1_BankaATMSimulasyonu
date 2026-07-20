package ders6.Pratikler

fun main() {

    print("1 ile 12 arasında bir ay numarası giriniz:")
    val ayNumarasi = readln().toIntOrNull()

    if (ayNumarasi == null) {
        println("Geçersiz Giriş! Lütfen sayı giriniz.")
        return
    }

    when (ayNumarasi) {
        12, 1, 2 -> println("Kış")
        3, 4, 5 -> println("İlkbahar")
        6, 7, 8 -> println("Yaz")
        9, 10, 11 -> println("Sonbahar")
        else -> println("Geçerli bir sayı giriniz")
    }

}