package com.example.kotlindersleri.collections

import java.util.ArrayList

fun main() {

    //Tanımlama
    val meyveler = ArrayList<String>()

    //Veri Ekleme: En sona ekleme yapar
    meyveler.add("Elma")    //0. index
    meyveler.add("Muz")     //1. index
    meyveler.add("Kiraz")   //2. index
    println(meyveler)
    println("-------------------------")


    //Güncelleme
    meyveler[1] = "Yeni Muz" // 1. İndeksi Güncelle
    println(meyveler)
    println("-------------------------")


    //Veri Ekleme 2: İstenilen bir index'e veri ekleme
    meyveler.add(1,"Portakal")
    println(meyveler)
    println("-------------------------")


    //Okuma
    println(meyveler.get(3)) //3. Index'i oku
    println(meyveler[3])     //3. Index'i oku
    println("-------------------------")


    println("Boyut: ${meyveler.size}") //Liste uzunluğunu verir.
    println("-------------------------")


    meyveler.reverse() //Listeyi Ters çevirir.
    println(meyveler)
    println("-------------------------")


    for(meyve in meyveler){
        println("Sonuc: $meyve")
    }
    println("-------------------------")


    for((indeks,meyve) in meyveler.withIndex()){
        println("$indeks -> $meyve")
    }
    println("-------------------------")


    //Silme
    meyveler.removeAt(1) //İstenilen index'teki veriyi kaldırır.
    println(meyveler)
    println("-------------------------")


    meyveler.clear() //Listenin içini tamamen siler
    println(meyveler)
    println("-------------------------")
}