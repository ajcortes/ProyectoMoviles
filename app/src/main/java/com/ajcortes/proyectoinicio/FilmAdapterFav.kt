package com.ajcortes.proyectoinicio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ajcortes.proyectoinicio.data.Film
import com.ajcortes.proyectoinicio.databinding.FilmItemFavBinding

class FilmAdapterFav (
    private var filmList : MutableList<Film>,
    private val onClickDetails : (Int) -> Unit
) : RecyclerView.Adapter<FilmAdapterFav.FilmViewHolder>() {

    companion object{
        const val DRAWABLE = "drawable"
    }

    class FilmViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        private val binding = FilmItemFavBinding.bind(itemView)

        fun bind(film: Film,
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

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FilmViewHolder(layoutInflater.inflate(R.layout.film_item_fav,parent,false))
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val film = filmList[position]
        holder.bind(film,onClickDetails)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }
}
