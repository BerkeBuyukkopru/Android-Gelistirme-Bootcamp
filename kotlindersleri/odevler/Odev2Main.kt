package com.example.kotlindersleri.odevler

fun main() {

    val f1 = Odev2()

    val fh= f1.donustur(100.0)
    println("Fahrenhiet: $fh")
    println("----------------------")


    val dikdortgenCevre= f1.cevreHesapla(15,20)
    println("Dikdörtgen Çevresi: $dikdortgenCevre")
    println("----------------------")


    val faktoriyel = f1.faktoriyelHesapla(5)
    println("Faktoriyel: $faktoriyel")
    println("----------------------")


    val aBul = f1.kelimeHesapla("karadeniz")
    println("Kelimedeki 'a' Sayısı: $aBul")
    println("----------------------")


    val icAciToplami = f1.icacilarToplami(6)
    println("İç Açılar Toplamı: $icAciToplami")


    val maasHesabi = f1.maasHesapla(30)
    println("Alınan Maas: $maasHesabi TL")


    val kotaHesabi = f1.kotaHesapla(51)
    println(kotaHesabi)
}