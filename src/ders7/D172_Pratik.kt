package ders7

fun main() {

    val sesSeviyesi = 100

    if (sesSeviyesi !in 0..100) {
        println("Hata: Ses seviyesi sadece 0 ile yüz arasında olabilir")
    }else{
        println("Ses seviyesi başarıyla ayarlandı")
    }


}