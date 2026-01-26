


package com.example.movieapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
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
            Toast.makeText(
                this,
                "Fight Club:\nAn insomniac office worker forms an underground fight club.",
                Toast.LENGTH_LONG
            ).show()
        }

        shawshank.setOnClickListener {
            Toast.makeText(
                this,
                "The Shawshank Redemption:\nTwo imprisoned men bond over years, finding redemption.",
                Toast.LENGTH_LONG
            ).show()
        }

        interstellar.setOnClickListener {
            Toast.makeText(
                this,
                "Interstellar:\nA team travels through a wormhole to save humanity.",
                Toast.LENGTH_LONG
            ).show()
        }

        shutterIsland.setOnClickListener {
            Toast.makeText(
                this,
                "Shutter Island:\nA U.S. Marshal investigates a psychiatric facility.",
                Toast.LENGTH_LONG
            ).show()
        }

        inception.setOnClickListener {
            Toast.makeText(
                this,
                "Inception:\nA thief steals secrets through dream-sharing technology.",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}


