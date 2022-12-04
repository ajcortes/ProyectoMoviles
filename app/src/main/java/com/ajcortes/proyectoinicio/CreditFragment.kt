package com.ajcortes.proyectoinicio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ajcortes.proyectoinicio.databinding.FragmentCreditBinding
import com.ajcortes.proyectoinicio.databinding.FragmentMenuBinding

class CreditFragment : Fragment() {

    private var _binding : FragmentCreditBinding? = null
    val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreditBinding.inflate(inflater,container,false)

        binding.butVolver.setOnClickListener{
            findNavController().navigate(R.id.action_creditFragment_to_menuFragment2)
        }

        return binding.root
    }

}