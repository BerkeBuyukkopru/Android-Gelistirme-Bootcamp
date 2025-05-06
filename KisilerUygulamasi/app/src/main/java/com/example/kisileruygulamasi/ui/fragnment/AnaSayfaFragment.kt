package com.example.kisileruygulamasi.ui.fragnment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.example.kisileruygulamasi.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        binding.fabEkle.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaToKisiKayit)
        }
        binding.buttonDetay.setOnClickListener {
            val kisi = Kisiler(1,"Ahmet","1111")
            val gecis = AnaSayfaFragmentDirections.anasayfaToKisiDetay(kisi = kisi)
            Navigation.findNavController(it).navigate(gecis)
        }

    return binding.root
    }

}