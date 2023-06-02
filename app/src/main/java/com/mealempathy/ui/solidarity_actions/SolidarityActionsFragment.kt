package com.mealempathy.ui.solidarity_actions

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mealempathy.databinding.FragmentSolidarityActionsBinding

class SolidarityActionsFragment : Fragment() {
    private var _binding: FragmentSolidarityActionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSolidarityActionsBinding.inflate(inflater, container, false)

        binding.searchButton.setOnClickListener{
            search()
        }

        binding.apaeButtonMaps.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)

            intent.setData(Uri.parse("https://www.google.com.br/maps/place/APAE-Associa%C3%A7%C3%A3o+de+Pais+e+Amigos+dos+Excepcionais/@-26.9374809,-48.9378776,15z/data=!4m6!3m5!1s0x94df3b3450e2c7b1:0xd75454476e8eca24!8m2!3d-26.9374809!4d-48.9378776!16s%2Fg%2F1tzgkt00?entry=ttu"))

            startActivity(intent)
        }

        binding.funiculiFuniculaButtonMaps.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)

            intent.setData(Uri.parse("https://www.google.com.br/maps/place/Ristorante+Funicul%C3%AC+Funicul%C3%A0+Blumenau/@-26.9373848,-49.0923849,11z/data=!4m10!1m2!2m1!1sfuniculi+funicula!3m6!1s0x94df18e85c3179cd:0x775df948e74c8911!8m2!3d-26.9252862!4d-49.0707316!15sChFmdW5pY3VsaSBmdW5pY3VsYVoTIhFmdW5pY3VsaSBmdW5pY3VsYZIBEml0YWxpYW5fcmVzdGF1cmFudOABAA!16s%2Fg%2F11g_2ptfd?entry=ttu"))

            startActivity(intent)
        }

        binding.wunderwaldButtonMaps.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)

            intent.setData(Uri.parse("https://www.google.com/maps/place/Restaurante+T%C3%ADpico+Colonial+Wunderwald/@-26.8052339,-49.2454787,12z/data=!4m13!1m2!2m1!1swunderwald!3m9!1s0x94dee57a102eea6d:0x6bddb13acca040d4!5m2!4m1!1i2!8m2!3d-26.8052578!4d-49.1656532!15sCgp3dW5kZXJ3YWxkWgwiCnd1bmRlcndhbGSSARFnZXJtYW5fcmVzdGF1cmFudOABAA!16s%2Fg%2F1tt1jcdj?entry=ttu"))

            startActivity(intent)
        }

        binding.lutheranChurchButtonMaps.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)

            intent.setData(Uri.parse("https://www.google.com/maps/place/Igreja+Luterana+do+Ap%C3%B3stolo+Jo%C3%A3o/@-26.7379687,-49.176111,15z/data=!4m6!3m5!1s0x94dee51a49d79bad:0xf7358441b25097df!8m2!3d-26.7379687!4d-49.176111!16s%2Fg%2F1vd771ql?entry=ttu"))

            startActivity(intent)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }

    private fun search(){
        val search = binding.searchField.editText?.text.toString().trim()

        if(search == ""){
            binding.apaeCard.alpha = 1F
            binding.funiculiFuniculaCard.alpha = 1F
            binding.wunderwaldCard.alpha = 1F
            binding.lutheranChurchCard.alpha = 1F

            return
        }

        if(binding.apaeTitle.text.contains(search, ignoreCase = true)) binding.apaeCard.alpha = 1F
        else binding.apaeCard.alpha = .2F

        if(binding.funiculiFuniculaTitle.text.contains(search, ignoreCase = true)) binding.funiculiFuniculaCard.alpha = 1F
        else binding.funiculiFuniculaCard.alpha = .2F

        if(binding.wunderwaldTitle.text.contains(search, ignoreCase = true)) binding.wunderwaldCard.alpha = 1F
        else binding.wunderwaldCard.alpha = .2F

        if(binding.lutheranChurchTitle.text.contains(search, ignoreCase = true)) binding.lutheranChurchCard.alpha = 1F
        else binding.lutheranChurchCard.alpha = .2F
    }
}
