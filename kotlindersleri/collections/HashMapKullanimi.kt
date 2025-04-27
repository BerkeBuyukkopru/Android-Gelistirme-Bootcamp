package com.example.kotlindersleri.collections

fun main() {

    //HashMap: JSON veri modeline benzemektedir. (KEY-VALUE İLİŞKİSİ)
    //MAP, DİCTİONARY(Swift)

    val iller = HashMap<Int, String>()

    iller.put(16,"BURSA")
    iller[34] = "ISTANBUL"
    iller[6] = "ANKARA"
    println(iller)
    println("-------------------------")
    println("")
    

    iller[16] = "YENI BURSA"
    println(iller)
    println("-------------------------")
    println("")


    val il = iller[6]
    println(il)
    println("-------------------------")
    println("")


    println("Boyut: ${iller.size}")
    println("-------------------------")
    println("")


    for ((anahtar,deger) in iller){
        println("$anahtar -> $deger")
    }
    println("-------------------------")
    println("")


    iller.remove(34)
    println(iller)
    println("-------------------------")
    println("")


    iller.clear()
    println(iller)
    println("-------------------------")
    println("")
}