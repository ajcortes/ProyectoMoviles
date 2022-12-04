package com.ajcortes.proyectoinicio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ajcortes.proyectoinicio.data.Film
import com.ajcortes.proyectoinicio.databinding.FilmItemBinding

class FilmAdapter (
    private var filmList : MutableList<Film>,
    private val onClickFavourite : (Int) -> Unit,
    private val onClickDetails : (Int) -> Unit
) : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>() {

    companion object{
        const val DRAWABLE = "drawable"
    }

    class FilmViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        private val binding = FilmItemBinding.bind(itemView)

        fun bind(film: Film,
                 onClickFavourite: (Int) -> Unit,
                 onClickDetails: (Int) -> Unit
        ){
            val context = binding.ivPortada.context
            val idRes = context.resources.getIdentifier(film.image, DRAWABLE,context.packageName)

            binding.ivPortada.setImageResource(idRes)
            binding.tvTitle.text = film.englishTitle
            binding.tvYearRelease.text = film.year
            binding.tvDuration.text = film.duration
            binding.tvScore.text = film.rt

            binding.root.setOnClickListener{
                onClickDetails(adapterPosition)
            }

            binding.ivStar.setOnClickListener{
                onClickFavourite(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FilmViewHolder(layoutInflater.inflate(R.layout.film_item,parent,false))
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val film = filmList[position]
        holder.bind(film,onClickFavourite,onClickDetails)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }
}
