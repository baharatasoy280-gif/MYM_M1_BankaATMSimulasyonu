package ders6.Pratikler

fun main() {

    print("Sepetinizdeki toplam tutarı giriniz:")
    val toplamTutar = readln().toDoubleOrNull()

    if (toplamTutar == null) {
        print("Geçersiz veri girişi !  Lütfen rakam kullanarak bir tutar giriniz.")
        return
    }
    if (toplamTutar < 0) {
        println("Hata: Sepet tutarı sıfırdan küçük olamaz!")
        return
    }
    val kargoUcreti = when {
        toplamTutar >= 300.0 -> 0.0   // 300 ve üstü bedava
        toplamTutar >= 100.0 -> 15.0  // 100 ile 299.99 arası
        else -> 30.0
    }
    val toplamOdenecek = toplamTutar + kargoUcreti
    println("\n--- 🧾 FATURA ---")
    println("Sepet Tutarı : $toplamTutar TL")
    println("Kargo Ücreti : ${if (kargoUcreti == 0.0) "BEDAVA!" else "$kargoUcreti TL"}")
    println("Toplam Tutar : $toplamOdenecek TL")


    }