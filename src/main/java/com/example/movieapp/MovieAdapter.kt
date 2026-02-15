package com.example.movieapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movieList: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieImage: ImageView = itemView.findViewById(R.id.movieImage)
        val movieTitle: TextView = itemView.findViewById(R.id.movieTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]

        holder.movieTitle.text = movie.title
        holder.movieImage.setImageResource(movie.image)

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context

            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("title", movie.title)
            intent.putExtra("description", movie.description)
            intent.putExtra("image", movie.image)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = movieList.size
}
