package ders7

fun main() {

    println("**Latin Harfleri**")
    for (harf in 'a'..'f') {
        print("$harf ")

    }

    println("**Türkçe Harfler**")
    val turkceAlfabe = "abcçdegğhıiklmnoöprsştuüvyz"
    for (harf in turkceAlfabe) {
        print("$harf ")
    }

}