package com.example.kotlindersleri

fun main() {

    //1. Compile Error: Kod yazarken oluşan hatalar.
    //val sayi = 100
    //sayi = 500

    //2. Runtime Error (Exceptions): Uygulama çalışınca oluşan hatalar.
    val x = 10
    val y = 0

    try {
        println("Sonuc: ${x/y}")
        print("Islem Tamamlandi")
    }
    catch (e: Exception){
        println(e.message)
    }
}