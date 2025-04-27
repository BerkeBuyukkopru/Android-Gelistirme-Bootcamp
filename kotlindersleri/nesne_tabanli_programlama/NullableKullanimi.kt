package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nullable - Null Safety - Optional(Swift).
    //Genellikle "mobil uygulama geliştirme" dillerinde yer almaktadır.
    //null - nan - nil : Içerik boş, uygulama kendini kapatır. Uygulamaları çökertir.
    //Sistem bize kod yazarken "null" kontrolü yaptırarak uygulamaların çökmesini engeller.


    //1. Tanımlama
    var mesaj : String? = null
    //mesaj = "Merhaba"


    //Yöntem 1
    //Soru işareti Kullanmak : Sorun yoksa çalışır, sorun varsa uygulama çökmez. Null döndürür.
    println("Yontem 1: ${mesaj?.uppercase()}")


    //Yöntem 2
    //Çift Ünlem Kullanmak : Sorun yoksa çalışır, sorun varsa uygulama çöker. Çok emin olunan kodlarda kullanılır.
    println("Yontem 2: ${mesaj!!.uppercase()}")


    //Yöntem 3
    //Null Kontrol : IF-ELSE Yapısı ile kontrol edilir.
    if (mesaj != null){
        println("Yontem 3: ${mesaj.uppercase()}")
    }
    else{
        println("Değişkende null değer yer almaktadır.")
    }


    //Yöntem 4
    //Null Kontrol 2 : Mesaj null değilse bu parantez çalışır. Null ise hiçbir şey dönmez.
    mesaj?.let {
        println("Yontem 4: ${mesaj.uppercase()}")
    }
}