package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val sonuc = 5.carp(2)
    println(sonuc)
    println("------------------")


    val sonuc2 = 6 carp2 2
    println(sonuc2)
    println("------------------")
}


fun Int.carp(sayi:Int): Int {
    return this * sayi //this(int) - gelecek olan değer
}

infix fun Int.carp2(sayi:Int): Int{
    return this * sayi //this(int) - gelecek olan değer
}