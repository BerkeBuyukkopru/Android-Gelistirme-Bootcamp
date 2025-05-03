package com.example.calismayapisi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calismayapisi.databinding.ActivityDetayBinding
import com.example.calismayapisi.databinding.ActivityMainBinding

class DetayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetayBinding //değişken oluşturuyoruz.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetayBinding.inflate(layoutInflater) //görsel kısımları inflate içindeki sınıla kodlamaya aktarıyoruz.
        setContentView(binding.root) //Tasarımı bağlar.

    val gelenMesaj = intent.getStringExtra("mesaj") //veri transferinde gelen veriyi al
        binding.textViewSonuc.text = gelenMesaj //textView' a gelen mesajı yazdır.
    }
}