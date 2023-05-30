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

        binding.apaeButtonMaps.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)

            intent.setData(Uri.parse("https://www.google.com.br/maps/place/APAE-Associa%C3%A7%C3%A3o+de+Pais+e+Amigos+dos+Excepcionais/@-26.9374809,-48.9378776,15z/data=!4m6!3m5!1s0x94df3b3450e2c7b1:0xd75454476e8eca24!8m2!3d-26.9374809!4d-48.9378776!16s%2Fg%2F1tzgkt00?entry=ttu"))

            startActivity(intent)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}
