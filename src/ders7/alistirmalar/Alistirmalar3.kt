package ders7.alistirmalar

fun main() {


    var sonuc = 0

    for (sayi in 2..100 step 2) {

        sonuc += sayi

    }
    print("1 ile 100 arasındsaki çift sayıların toplamı: $sonuc")
}