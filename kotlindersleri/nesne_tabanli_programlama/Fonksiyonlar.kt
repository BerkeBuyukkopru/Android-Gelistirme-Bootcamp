package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {

    //void - sadece işlem yap
    fun selamla1(){
        val sonuc = "Merhaba"
        println(sonuc)
    }

    //return - işlem yap ve veri transferi gerçekleştir
    fun selamla2() : String{
        val sonuc = "Merhaba"
        return sonuc
    }

    //parametreli
    fun selamla3(isim:String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
        println("----------------------")
    }

    //Overloading - Bir sınıf içerisinde, aynı isimde fonksiyonları tekrar kullanmak (Ekstra parametre ekle ya da tür değiştir.)
    fun topla(sayi1:Int,sayi2:Int){
        println("Toplam: ${sayi1+sayi2}")
        println("----------------------")
    }

    fun topla(sayi1:Double,sayi2:Double){
        println("Toplam: ${sayi1+sayi2}")
        println("----------------------")
    }

    fun topla(sayi1:Int,sayi2:Int,isim:String){
        println("Toplam: ${sayi1+sayi2} - Islem Yapan: $isim")
        println("-------------------------------------------")
    }
}