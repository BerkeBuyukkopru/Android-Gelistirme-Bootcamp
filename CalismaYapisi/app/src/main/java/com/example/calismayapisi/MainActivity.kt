package com.example.calismayapisi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calismayapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //değişken oluşturuyoruz.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) //görsel kısımları inflate içindeki sınıla kodlamaya aktarıyoruz.
        setContentView(binding.root)

        binding.buttonDetay.setOnClickListener {
            //binding.textViewAnasayfa.text = "Merhaba" //Butona basıldığında textview da "Merhaba" yazdır.
            val intent = Intent(this@MainActivity, DetayActivity::class.java) //Sayfalar Arası Geçiş Kodu.
            intent.putExtra("mesaj","Selam, Nasılsın?") //Gönderilecek Mesaj. (değişken, değişken value)
            startActivity(intent) //İşlemi Başlat
        }
    }
}