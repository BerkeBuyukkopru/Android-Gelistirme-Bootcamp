package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {

    /*
    //NESNE OLUŞTURMA
    val y1 = Yemekler(100,"Kofte",249)
    val y2 = Yemekler(200,"Baklava",300)

    //DEĞER OKUMA
    println("Id   : ${y1.id}")
    println("Ad   : ${y1.ad}")
    println("Fiyat: ${y1.fiyat}")
    println("------------------")
    println("Id   : ${y2.id}")
    println("Ad   : ${y2.ad}")
    println("Fiyat: ${y2.fiyat}")
    println("------------------")


    //DEĞER ATAMA/DEĞİŞTİRME
    y1.fiyat=450
    println("Id   : ${y1.id}")
    println("Ad   : ${y1.ad}")
    println("Fiyat: ${y1.fiyat}")
    println("------------------")

    y2.ad = "Soguk Baklava"
    println("Id   : ${y2.id}")
    println("Ad   : ${y2.ad}")
    println("Fiyat: ${y2.fiyat}")
    println("------------------")

     */

    //FONKSİYON İLE İŞLEMLER
    val y1 = Yemekler(100,"Kofte",249)
    val y2 = Yemekler(200,"Baklava",300)

    y1.bilgiAl()
    y2.bilgiAl()

    y1.fiyat=350
    y1.bilgiAl()


    y2.ad = "Soğuk Baklava"
    y2.bilgiAl()
}