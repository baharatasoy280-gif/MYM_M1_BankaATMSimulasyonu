package ders6.Pratikler

fun main() {

    print("Lütfen bir metin giriniz:")
    val girilenMetin = readln()

    val temizMetin = girilenMetin.trim().lowercase()

   // println(temizMetin)

    when {
        temizMetin == "merhaba" -> println("Size de merhaba!")
        temizMetin == "saat kaç" -> println("Şu an saat 14:00")
        temizMetin.contains("hava") -> println("Dışarıda harika bir hava var.")
        else -> println("Ne demek istediğinizi anlayamadım.")
    }


}