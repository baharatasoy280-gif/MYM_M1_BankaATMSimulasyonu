package ders6.Pratikler

fun main() {

    print("Lütfen yaşınızı giriniz:")
    val ziyaretciYasi = readln().toIntOrNull()

    if (ziyaretciYasi == null) {
        print("Lütfen sadece sayı giriniz.")
    }

    when (ziyaretciYasi) {
        in 0..9 -> print("Ücretsiz Tarife: 0 TL")
        in 7..18 -> print("Öğrenci Tarifesi: 50 TL")
        in 19..64 -> print("Tam Tarife: 100 TL")
        in 65..120 -> print("Emekli İndirimi: 40 TL")
        else -> print("Geçersiz yaş!")

    }

}