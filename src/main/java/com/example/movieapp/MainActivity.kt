package com.example.movieapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewMovies)

        val movieList = listOf(
            Movie("Fight Club", "An insomniac office worker forms an underground fight club.", R.drawable.fight_club),
            Movie("The Shawshank Redemption", "Two imprisoned men bond over years, finding redemption.", R.drawable.shawshank),
            Movie("Interstellar", "A team travels through a wormhole to save humanity.", R.drawable.interstellar),
            Movie("Shutter Island", "A U.S. Marshal investigates a psychiatric facility.", R.drawable.shutter_island),
            Movie("Inception", "A thief steals secrets through dream-sharing technology.", R.drawable.inception)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MovieAdapter(movieList)
    }
}


