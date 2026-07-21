package ders6.alistirmalar

fun main() {

    print("Lütfen 1 ile 12 arasında bir ay numarası giriniz:")
    val ayNumarasi = readln().toIntOrNull()

    if (ayNumarasi != null) {

        val mevsim = when (ayNumarasi) {

            12, 1, 2 -> "Kış"
            3, 4, 5 -> "İlkbahar"
            6, 7, 8 -> "Yaz"
            9, 10, 11 -> "Sonbahar"
            else -> "Geçersiz ay"
        }

        print("Seçtiğiniz ayın mevsimi -> $mevsim")


    } else {
        print("Geçerli bir sayı giriniz.")
    }


}