package com.ajcortes.proyectoinicio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ajcortes.proyectoinicio.data.DataSource
import com.ajcortes.proyectoinicio.databinding.FragmentDetailsFilmBinding
import com.ajcortes.proyectoinicio.databinding.FragmentMenuBinding

class DetailsFilmFragment : Fragment() {

    private var _binding : FragmentDetailsFilmBinding? = null
    val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailsFilmBinding.inflate(inflater,container,false)

        val filmList = DataSource.getFilmList()
        val args = DetailsFilmFragmentArgs.fromBundle(requireArguments())

        val film = filmList[args.film]

        val context = binding.ivBannerDetails.context
        val idRes = context.resources.getIdentifier(film.banner, FilmAdapter.DRAWABLE,context.packageName)

        binding.ivBannerDetails.setImageResource(idRes)
        binding.tvJapan.text = film.japaneseTitle +"/"+film.englishTitle
        binding.tvDirector.text = film.director
        binding.tvProducer.text = film.producer
        binding.tvRottenTomatoes.text = film.rt+"/100"
        binding.tvYear.text = film.year
        binding.tvTime.text = film.duration+" mins"

        binding.butVolverDetail.setOnClickListener{
            findNavController().navigate(R.id.action_detailsFilmFragment_to_filmsFragment)
        }

        return binding.root
    }
}