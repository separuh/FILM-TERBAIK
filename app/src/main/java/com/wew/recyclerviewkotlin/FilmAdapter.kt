package com.wew.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class FilmAdapter(private val context: Context, private val film: List<Film>, val listener: (Film) -> Unit)
    : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>(){

    class FilmViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgFilm = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameFilm = view.findViewById<TextView>(R.id.tv_item_name)
        val descFilm = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(film: Film, listener: (Film) -> Unit) {
            imgFilm.setImageResource(film.imgFilm)
            nameFilm.text = film.nameFilm
            descFilm.text = film.descFilm
            itemView.setOnClickListener {
                listener(film)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        return FilmViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_film, parent, false)
        )
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.bindView(film[position],listener)
    }

    override fun getItemCount(): Int = film.size

    }

