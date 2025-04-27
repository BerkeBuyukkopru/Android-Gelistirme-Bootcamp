package com.example.kotlindersleri.collections

import java.util.ArrayList

fun main() {

    val f1 = Filmler(1,"Interstellar",50)
    val f2 = Filmler(2,"Prestige",90)
    val f3 = Filmler(3,"Oppenheimer",75)


    val filmlerListesi = ArrayList<Filmler>()
    filmlerListesi.add(f1)
    filmlerListesi.add(f2)
    filmlerListesi.add(f3)


    for (film in filmlerListesi){
        println("${film.id} : ${film.ad} : ${film.fiyat} TL")
    }
    println("-------------------------")


    //Sıralama (Sorting)
    println("")
    println("---------- Fiyata Gore Artan ----------")
    //it : sırayla gelen nesneyi temsil eder. Listenin içindeki eleman bilgisi
    val siralama1 = filmlerListesi.sortedWith(compareBy { it.fiyat }) //Fiyata göre sıralama yap
    for (film in siralama1){
        println("${film.id} : ${film.ad} : ${film.fiyat} TL")
    }
    println("-------------------------")


    println("")
    println("---------- Fiyata Gore Azalan ----------")
    val siralama2 = filmlerListesi.sortedWith(compareByDescending { it.fiyat }) //Fiyata göre sıralama yap
    for (film in siralama2){
        println("${film.id} : ${film.ad} : ${film.fiyat} TL")
    }
    println("-------------------------")


    //Filtreleme
    println("")
    println("---------- Filtreleme 1 ----------")
    var filtre1 = filmlerListesi.filter { it.fiyat > 60 }
    for (film in filtre1){
        println("${film.id} : ${film.ad} : ${film.fiyat} TL")
    }
    println("-------------------------")


    println("")
    println("---------- Filtreleme 1 ----------")
    //Belirtilen hafrlerin geçtiği bir filtreleme
    var filtre2 = filmlerListesi.filter { it.ad.contains("ge") }
    for (film in filtre2){
        println("${film.id} : ${film.ad} : ${film.fiyat} TL")
    }
    println("-------------------------")
}