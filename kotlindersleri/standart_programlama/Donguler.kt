package com.example.kotlindersleri.standart_programlama

fun main() {

    //FOR DÖNGÜSÜ
    for (i in  1..3){ //Swift 1...3 olarak kullanılır.
        println("Döngü 1 = $i")
    }
    println("------------------")

    for (i in 10..20 step 5){ //step: atlanan adım sayısı.
        println("Döngü 2 = $i")
    }
    println("------------------")

    for (i in 20 downTo 10 step 5){//downTo : geriye gidiş.
        println("Döngü 3 = $i")
    }
    println("------------------")


    //WHILE DONGUSU
    var sayac = 1
    while (sayac<4){
        println("Döngü 4 = $sayac")
        sayac ++
    }
    println("------------------")


    //BREAK VE CONTİNUE YAPISI
    //SADECE İF ŞARTLARI İLE ÇALIŞTIR.
    for (i in 1..5){
        if (i == 3){
            break //Döngüyü durdurur.
        }
        println("Döngü 5 = $i")
    }
    println("------------------")


    for (i in 1..5){
        if (i == 3){
            continue //Bulunduğu adımı pas geçer..
        }
        println("Döngü 6 = $i")
    }
    println("------------------")
}