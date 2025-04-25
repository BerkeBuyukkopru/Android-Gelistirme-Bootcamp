package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {

    val f = Fonksiyonlar()

    //void = Unit
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()
    println(gelenSonuc)
    println("----------------------")

    //Parametre
    f.selamla3("Berke")

    //Overload
    f.topla(10,20,"Beyza")
    f.topla(20.5,19.2)

}