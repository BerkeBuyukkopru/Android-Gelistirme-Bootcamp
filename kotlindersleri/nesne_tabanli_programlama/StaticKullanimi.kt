package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {

    val a = ClassA()


    /*
    //Standart Nesne Tabanlı Erisim
    println(a.x)
    a.metod()
    println("------------------------------")

    //Sanal Nesne (Virtual Object)(Nameless Onject) = Her seferinde yeni nesne oluşturur. Standart erişimde tek nesne oluşturulur.
    println(ClassA().x) //1. Nesne
    ClassA().metod() //2. Nesne
    println("------------------------------")
    */



    //Static Kullanımı = Parantez varsa nesne var, parantez yoksa Static Kullanimi
    println(ClassA.x)
    ClassA.metod()
    println("------------------------------")
}