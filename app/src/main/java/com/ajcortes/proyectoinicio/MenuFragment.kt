package com.ajcortes.proyectoinicio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ajcortes.proyectoinicio.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private var _binding : FragmentMenuBinding? = null
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
        _binding = FragmentMenuBinding.inflate(inflater,container,false)

        binding.butFilms.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_filmsFragment)
        }

        binding.butFavFilms.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_favouriteFilmsFragment)
        }

        binding.butUser.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_userFragment)
        }

        binding.butCredits.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_creditFragment)
        }

        binding.butExit.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_loginFragment)
        }

        return binding.root
    }
}