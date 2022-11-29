package com.ajcortes.proyectoinicio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ajcortes.proyectoinicio.data.Film
import com.ajcortes.proyectoinicio.databinding.FilmItemBinding

class FilmAdapter (
    private var filmList : MutableList<Film>
) : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>() {

    class FilmViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        private val binding = FilmItemBinding.bind(itemView)
        fun bind(film : Film){
            val context = binding.ivPortada.context
//            val idRes = context.resources.getIdentifier(film.image,context.packageName)



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FilmViewHolder(layoutInflater.inflate(R.layout.film_item,parent,false))
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val film = filmList[position]
        holder.bind(film)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }
}
