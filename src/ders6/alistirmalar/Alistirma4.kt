package ders6.alistirmalar

import java.util.Locale
import java.util.Locale.getDefault

fun main() {

    print("Lütfen bir metin giriniz:")
    val girilenMetin = readln().trim().lowercase()


    when {
        girilenMetin == "merhaba" -> {
            print("Size de merhaba!")
        }

        girilenMetin == "saat kaç" -> {
            print("Şuan saat 14:00")
        }

        girilenMetin.contains("hava") -> {
            print("Dışarıda harika bir hava var")
        }

        else -> print("Ne demek istediğinizi anlayamadım")
    }


}





