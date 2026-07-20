package ders6.Pratikler

fun main() {

    val komut = "yardım"

    val temizMetin = komut.trim().lowercase()

    when {
        temizMetin == "şifremi unuttum" -> println("Şifre sıfırlama linki gönderiliyor.")
        temizMetin.contains("yardım") -> println("Destek ekibine bağlanıyorsunuz.")
    }


}