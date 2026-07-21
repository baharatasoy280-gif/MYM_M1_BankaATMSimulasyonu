package ders6.alistirmalar

fun main() {
    print("Lütfen toplan sepet tutarını giriniz:")
    val sepetTutari = readln().toDoubleOrNull()

    if (sepetTutari != null) {

        when (sepetTutari) {
            in 0.00..99.99 -> {
                val kargoUcreti = 30.0
                println("Kargo ücreti: $kargoUcreti. Toplam ödenecek tutar: ${sepetTutari + kargoUcreti} TL")
            }

            in 100.0..299.99 -> {
                val kargoUcreti = 15.0
                println("Kargo ücreti: $kargoUcreti. Toplam Ödenecek tutar: ${sepetTutari + kargoUcreti} TL" )
            }
            in 300.0..Double.MAX_VALUE -> {
                val kargoUcreti = 15.0
                println("Kargo ücreti $kargoUcreti.Toplam Ödenecek tutar: ${sepetTutari + kargoUcreti} TL")
            }else -> print("Sepet tutarı negatif bir sayı olamaz.")
        }
    }else{

    }


}