package com.wew.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filmlist = listOf<Film>(
            Film(
                R.drawable.aperfectfit,
                nameFilm = "A perfect Fit",
                descFilm = "A Perfect Fit adalah sebuah film drama komedi romantis Indonesia tahun 2021 yang disutradarai oleh Hadrah Daeng Ratu dan ditulis oleh Garin Nugroho."
            ),
            Film(
                R.drawable.deepwater,
                nameFilm = "Deep Water",
                descFilm = "A well-to-do husband who allows his wife to have affairs in order to avoid a divorce becomes a prime suspect in the disappearance of her lovers."

            ),
            Film(
                R.drawable.dune,
                nameFilm = "Dune",
                descFilm = "Paul Atreides arrives on Arrakis after his father accepts the stewardship of the dangerous planet. However, chaos ensues after a betrayal as forces clash to control melange, a precious resource."
            ),
            Film(
                R.drawable.encanto,
                nameFilm = "Encanto",
                descFilm = "The Madrigals are an extraordinary family who live hidden in the mountains of Colombia in a charmed place called the Encanto."
            ),
            Film(
                R.drawable.fistfulofvengeance,
                nameFilm = "Fistful of Vengeance",
                descFilm = "A revenge mission becomes a fight to save the world from an ancient threat when superpowered assassin Kai tracks a killer to Bangkok."
            ),
            Film(
                R.drawable.freeguy,
                nameFilm = "Free Guy",
                descFilm = "When a bank teller discovers he's actually a background player in an open-world video game, he decides to become the hero of his own story -- one that he can rewrite himself."
            ),
            Film(
                R.drawable.junglecruiese,
                nameFilm = "Jungle Cruiese",
                descFilm = "Dr. Lily Houghton enlists the aid of wisecracking skipper Frank Wolff to take her down the Amazon in his ramshackle boat."
            ),
            Film(
                R.drawable.luca,
                nameFilm = "Luca",
                descFilm = "Set in a beautiful seaside town on the Italian Riviera, the original animated feature is a coming-of-age story about one young boy experiencing an unforgettable summer filled with gelato, pasta and endless scooter rides."
            ),
            Film(
                R.drawable.mortalkombat,
                nameFilm = "Mortal Kombat",
                descFilm = "Cole Young, an MMA champion, is a chosen warrior unaware of his destiny. A grave danger is looming upon the Earthrealm. He must learn to unlock his power and fight the warriors of Outworld."
            ),
            Film(
                R.drawable.rednotice,
                nameFilm = "Red Notice",
                descFilm = "In the world of international crime, an Interpol agent attempts to hunt down and capture the world's most wanted art thief."
            ),
            Film(
                R.drawable.snakeeyes,
                nameFilm = "Snake Eyes",
                descFilm = "An ancient Japanese clan called the Arashikage welcomes tenacious loner Snake Eyes after he saves the life of their heir apparent."
            ),
            Film(
                R.drawable.traintobusan,
                nameFilm = "Train to Busan",
                descFilm = "Jung Seok, a former soldier, along with his teammates, sets out on a mission to battle hordes of post-apocalyptic zombies in the Korean peninsula wastelands."
            ),

        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_film)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = FilmAdapter(this, filmlist){
            val intent = Intent (this, DetailFilmActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}