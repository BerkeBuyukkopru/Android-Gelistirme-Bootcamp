package com.example.kotlindersleri.nesne_tabanli_programlama

data class Yemekler (var id:Int, var ad:String, var fiyat:Int) {
    //Constructer - init fonksiyonu
    //Bu sınıftan nerse oluştuğunda çalışsın.

    init{
        println("***** Nesne Oluştu *****")
    }

    fun bilgiAl(){
        println("------------------")
        println("Id   : ${this.id}")
        println("Ad   : ${this.ad}")
        println("Fiyat: ${this.fiyat}")
    }
    //this = Bulunduğu sınıfı temsil eder. (Swift dilinde "self")
    //super = Kalıtım ile bir üst sınıfı temsil eder.
}