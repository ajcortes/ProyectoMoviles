package com.ajcortes.proyectoinicio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.ajcortes.proyectoinicio.data.DataSource
import com.ajcortes.proyectoinicio.data.Film
import com.ajcortes.proyectoinicio.databinding.FragmentFilmsBinding
import com.google.android.material.snackbar.Snackbar

class FavouriteFilmsFragment : Fragment() {

    private lateinit var filmAdapter: FilmAdapterFav
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var filmList : MutableList<Film>

    private var _binding : FragmentFilmsBinding? = null
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

        _binding = FragmentFilmsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadRecyclerView()
    }

    private fun loadRecyclerView(){
        binding.textList.text = getString(R.string.film_list_favorite)
        filmList = DataSource.getFilmList()

        filmAdapter = FilmAdapterFav(
            filmList,
            onClickDetails = { pos -> goDetails(pos)}
        )
        linearLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)

        binding.rvFilmList.adapter = filmAdapter
        binding.rvFilmList.layoutManager = linearLayoutManager
        binding.rvFilmList.adapter = filmAdapter
    }


    fun goDetails(pos : Int)
    {
        var film = filmList[pos].copy()

        findNavController().navigate(R.id.action_favouriteFilmsFragment_to_detailsFilmFavFragment)
    }
}