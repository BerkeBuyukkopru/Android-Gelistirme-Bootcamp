package com.example.kotlindersleri.standart_programlama

fun main() {

    //IF-ELSE YAPISI
    val yas= 23
    println(yas >=18) //true ya da false döner.
    println("------------------")

    if(yas>=24) {
        println("Reşitsiniz") //true
    }
    else{
        println("Reşit Değilsiniz.") //false
    }
    println("------------------")


    val ka = "admin"
    val s = 123456
    val sayi = 10

    if(ka == "admin" && s == 123456){// && = And(Ve) koşulu, true && true ise true, diğer durumlarda false olur.
        println("Hoşgeldiniz")
    }
    else{
        println("Hatalı Giriş")
    }
    println("------------------")


    if (sayi == 9 || sayi == 10){// || = Or(Veya) koşulu, false || false ise false, diğer durumlarda true olur.
        println("Sayı 9 veya 10")
    }
    else{
        println("Sayı 9 veya 10 değil.")
    }
    println("------------------")


    //WHEN YAPISI
    val number = 5

    when(number){ //Kıyaslanacak değişken (Switch-Case yapısı gibi)
        1 -> println("Sayı 1'dir.") //1 ise bunu çalıştır.
        2 -> println("Sayı 2'dir.") //2 ise bunu çalıştır.
        else -> println("Tanımlanmayan sayı") //diğer şeyler için bu çalıştır.
    }
    println("------------------")
}