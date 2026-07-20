package ders6.Pratikler

fun main() {

//Uzun if - else if zincirleri yazmak
// yerine parametresiz when kullanmanın kodunuzu ne
// kadar temiz gösterdiğini test edin. Kendi yaşınızı kontrol eden
// (Örn: 18’den küçük, 18-30 arası, 30’dan büyük) koşulları parametresiz
// bir when bloğuyla yazarak IDE’nizde çalıştırın.


    val kullaniciYasi = 21

    when {
        kullaniciYasi < 18 -> println("18'den küçük")
        kullaniciYasi in 18..30 -> println("18-30 arası")
        kullaniciYasi > 30 -> println("30'dan büyük")
        else -> println("Geçersiz Giriş")
    }


}