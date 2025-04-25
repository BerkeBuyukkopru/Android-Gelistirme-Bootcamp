package com.example.kotlindersleri.degiskenler

fun main() {

    //Empty Views Activity - > XML , Empty Activity -> Jetpack Compose
    //Paketlerle (Klasörlerle) çalışılacak (katmanlı mimari gibi)
    //Com.example.kotlindersleri -> new package -> degiskenler
    //degiskenler -> new kotlin class file -> file DegiskenOlusturma
    //MainActivity -> Başlangıç noktası. O yüzden fun main() oluşturup kodları içine yazıyoruz.


    //İLK KOD
    println("Merhaba Dünya")


    //DEĞİŞKEN OLUŞTURMA
    var id=1
    var ad = "Mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4500
    var stokDurum = true

    println(id)
    println(ad)
    println(resim)
    println(puan)
    println(fiyat)
    println(stokDurum)

    println("$id $ad $resim $puan $fiyat $stokDurum")
    println("ID: $id, Ad: $ad, Resim: $resim, Puan: $puan, Fiyat: $fiyat TL, Stok: $stokDurum")


    //DEĞİŞKEN OLUŞTURMA 2
    var id2=1
    var ad2 = "Mont"
    var resim2 = "mont.png"
    var puan2 = 4.7
    var fiyat2 = 4500
    var stokDurum2 = true

    println("Id : $id2")
    println("Ad : $ad2")
    println("Resim : $resim2")
    println("Puan : $puan2")
    println("Fiyat : $fiyat2")
    println("Stok Durum : $stokDurum2")


    //Sabitler (Constant) : Değiştirilemeyen değişken (val)
    val sayi = 50
    print(sayi)


    //TÜR DÖNÜŞÜMÜ
    // 1- SAYISALDAN SAYISALA DÖNÜŞÜM
    val d = 89.56
    val sonuc1 = d.toInt()
    println(sonuc1)

    val i =34
    val sonuc2 =i.toDouble()
    println(sonuc2)

    // 2- SAYISALDAN METİNE DÖNÜŞÜM
    var x = 85
    val sonuc3 = x.toString() //"85"
    println(sonuc3)

    // 3- METİNDEN SAYISALA DÖNÜŞÜM
    val yazi = "48"
    val sonuc4 = yazi.toInt()
    println(sonuc4)

    val yazi2 = "48T"
    val sonuc5 = yazi2.toIntOrNull()
    println(sonuc5)

}