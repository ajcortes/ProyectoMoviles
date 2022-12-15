package com.ajcortes.proyectoinicio

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ajcortes.proyectoinicio.data.DataSource
import com.ajcortes.proyectoinicio.data.Film
import com.ajcortes.proyectoinicio.databinding.FragmentFilmsBinding
import com.google.android.material.snackbar.Snackbar

class FilmsFragment : Fragment() {

    private lateinit var filmAdapter: FilmAdapter
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

        binding.butBotonVolverLista.setOnClickListener{
            findNavController().navigate(R.id.action_filmsFragment_to_menuFragment)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadRecyclerView()
    }

    private fun loadRecyclerView(){
        binding.textList.text = getString(R.string.film_list)
        filmList = DataSource.getFilmList()

        filmAdapter = FilmAdapter(
            filmList,
            onClickFavourite = { pos -> favFilm(pos)},
            onClickDetails = { pos -> goDetails(pos)}
        )
        linearLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)

        binding.rvFilmList.adapter = filmAdapter
        binding.rvFilmList.layoutManager = linearLayoutManager
        binding.rvFilmList.adapter = filmAdapter
    }

    fun favFilm(pos : Int)
    {
        var film = filmList[pos].copy()

        Snackbar.make(requireView(),requireContext().getString(R.string.selected_star,film.englishTitle), Snackbar.LENGTH_SHORT).show()
    }

    fun goDetails(pos : Int)
    {
        var film = filmList[pos].copy()

        findNavController().navigate(FilmsFragmentDirections.actionFilmsFragmentToDetailsFilmFragment(pos))
    }
}