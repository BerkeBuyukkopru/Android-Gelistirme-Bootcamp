package com.example.kisileruygulamasi.ui.fragnment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.databinding.FragmentKisiDetayBinding
import com.example.kisileruygulamasi.databinding.FragmentKisiKayitBinding


class KisiDetayFragment : Fragment() {
    private lateinit var binding: FragmentKisiDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKisiDetayBinding.inflate(inflater, container, false)

        val bundle: KisiDetayFragmentArgs by navArgs()
        val gelenkisi = bundle.kisi

        binding.editTextKisiAd.setText(gelenkisi.kisi_ad)
        binding.editTextKisiTel.setText((gelenkisi.kisi_tel))

        binding.buttonGuncelle.setOnClickListener {
            val kisi_ad =  binding.editTextKisiAd.text.toString()
            val kisi_tel = binding.editTextKisiTel.text.toString()
            guncelle(gelenkisi.kisi_id,kisi_ad,kisi_tel)
        }
        return binding.root
    }

    fun guncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String){
        Log.e("Kişi Güncelle","$kisi_id - $kisi_ad - $kisi_tel")
    }
}