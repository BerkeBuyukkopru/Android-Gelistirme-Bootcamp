package com.example.kotlindersleri.odevler

class Odev2 {

    fun donustur(derece: Double): Double{
        val fahrenhiet = (derece * 1.8) + 32
        return fahrenhiet
    }

    fun cevreHesapla(kenar1: Int, kenar2: Int): Int{
        val cevre= 2 * (kenar1 + kenar2)
        return cevre
    }

    fun faktoriyelHesapla(sayi: Int): Int{
        var fak = 1
        for (i in 1..sayi){
            fak = i*fak
        }
        return fak
    }

    fun kelimeHesapla(kelime: String): Int{
        var sayac = 0
        for (i in 0 until kelime.length){
            if (kelime[i] == 'a') {
                sayac = sayac + 1
            }
        }
        return sayac
    }

    fun icacilarToplami(kenarSayi: Int): Int{
        val toplam = (kenarSayi - 2) * 180
        return toplam
    }

    fun maasHesapla(gun: Int) : Int{
        var toplamCalisma = gun * 8
        var maas = 0

        if (toplamCalisma<=160){
            maas = toplamCalisma * 10
        }
        else {
            var mesaiCalisma = toplamCalisma - 160
            maas = (toplamCalisma * 10) + (mesaiCalisma * 20)
        }
        return maas
    }

    fun kotaHesapla(kota: Int): Int {
        var tutar = 0
        if (kota > 50) {
            tutar = 100 + ((kota - 50) * 4)
        } else {
            tutar = 100
        }
        return tutar
    }
}