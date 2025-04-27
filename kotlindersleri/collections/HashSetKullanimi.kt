package com.example.kotlindersleri.collections

fun main() {
    //HASHSET: Tekrarsız öğeler tutar.

    //Tanımlama
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)
    println("-------------------------")
    println("")

    meyveler.add("Elma") //Tekrar Listeye Eklenmez !
    println(meyveler)
    println("-------------------------")
    println("")

    meyveler.add("Amasya Elma")
    println(meyveler)
    println("-------------------------")
    println("")


    val y = meyveler.elementAt(2)
    println(y)

    println("Boyut: ${meyveler.size}")
    println("-------------------------")
    println("")


    for(meyve in meyveler){
        println("Sonuc: $meyve")
    }
    println("-------------------------")
    println("")


    for((indeks,meyve) in meyveler.withIndex()){
        println("$indeks -> $meyve")
    }
    println("-------------------------")
    println("")


    meyveler.remove("Elma") //İstenilen index'teki veriyi kaldırır.
    println(meyveler)
    println("-------------------------")
    println("")


    meyveler.clear() //Listenin içini tamamen siler
    println(meyveler)
    println("-------------------------")
    println("")
}