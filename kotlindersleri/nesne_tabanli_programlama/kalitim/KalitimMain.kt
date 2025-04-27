package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kopek = Kopek()
    val kedi = Kedi()

    hayvan.sesCikar()   //Kalıtım yok, kendi metoduna erişti.
    memeli.sesCikar()   //Kalıtım var, bir üst sınıfın metoduna erişti.
    kopek.sesCikar()    //Kalıtım var, kendi metoduna erişti.
    kedi.sesCikar()     //Kalıtım var, kendi metoduna erişti.

}

fun donusum(){

    //Nesneler arasında dönüşüm yapmak istiyorsak kalıtım ilişkisi olmak zorunda.

    //UpCasting: SubClass'ın (Alt Sınıf) SuperClass'a (Üst Sınıf) dönüşmesi.
    /*
    val kedi = Kedi()
    val hayvan: Hayvan = kedi // Upcasting: Kedi -> Hayvan (otomatik)
     */


    //DownCasting : SuperClass'ın (Üst Sınıf) SubClass'a (Alt Sınıf) dönüşmesi.
    /*
    val hayvan: Hayvan = Kedi()
    val kedi1: Kedi = hayvan as Kedi  // Downcasting: Hayvan -> Kedi (başarılı). as : dönüşüm başarısız olursa hata fırlatır.
    val kedi2: Kedi? = hayvan as? Kedi // Güvenli downcasting (null dönme ihtimali). as? : güvenli dönüşüm yapar, başarısızsa null döner.
     */
}