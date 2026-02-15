package com.example.movieapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fightClub = findViewById<ImageView>(R.id.imgFightClub)
        val shawshank = findViewById<ImageView>(R.id.imgShawshank)
        val interstellar = findViewById<ImageView>(R.id.imgInterstellar)
        val shutterIsland = findViewById<ImageView>(R.id.imgShutterIsland)
        val inception = findViewById<ImageView>(R.id.imgInception)

        fightClub.setOnClickListener {
            openDetail(
                "Fight Club",
                "An insomniac office worker forms an underground fight club.",
                R.drawable.fight_club
            )
        }

        shawshank.setOnClickListener {
            openDetail(
                "The Shawshank Redemption",
                "Two imprisoned men bond over years, finding redemption.",
                R.drawable.shawshank
            )
        }

        interstellar.setOnClickListener {
            openDetail(
                "Interstellar",
                "A team travels through a wormhole to save humanity.",
                R.drawable.interstellar
            )
        }

        shutterIsland.setOnClickListener {
            openDetail(
                "Shutter Island",
                "A U.S. Marshal investigates a psychiatric facility.",
                R.drawable.shutter_island
            )
        }

        inception.setOnClickListener {
            openDetail(
                "Inception",
                "A thief steals secrets through dream-sharing technology.",
                R.drawable.inception
            )
        }
    }

    private fun openDetail(title: String, description: String, image: Int) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("title", title)
        intent.putExtra("description", description)
        intent.putExtra("image", image)
        startActivity(intent)
    }
}


