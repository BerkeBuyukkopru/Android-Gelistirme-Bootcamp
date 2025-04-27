package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

class Kedi : Memeli() {
    override fun sesCikar() {
        //super.sesCikar() -> super: Ust sinifi temsil eder.
        println("Miyav")
    }
}