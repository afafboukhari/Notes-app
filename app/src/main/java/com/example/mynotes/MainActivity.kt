package com.example.mynotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.add_button
import kotlinx.android.synthetic.main.activity_main.notes_list
import kotlinx.android.synthetic.main.activity_main.numberofnotes
import kotlinx.android.synthetic.main.activity_main.settings_ic
import kotlinx.android.synthetic.main.activity_main2.Title

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val notes : ArrayList<NotesModel> = ArrayList()
        notes.add(NotesModel(title = "Hehehehe"))
        notes.add(NotesModel(title = "Hohohohohohoho"))
        notes.add(NotesModel(title = "to do list"))
        notes.add(NotesModel(title = "if you never blincked then I would've looked away at the first glance"))
        notes.add(NotesModel(title = "If you tasted poison you could|ve spit me out at the first chance"))
        notes.add(NotesModel(title = "and if I was some paint did it splatter on a promising grown man ?"))
        notes.add(NotesModel(title = "and if I was a child did it matter if you got to wash your hands"))
        notes.add(NotesModel(title = "oooooooooooooh oh oh"))
        notes.add(NotesModel(title = "All I used to do was pray"))
        notes.add(NotesModel(title = "would've could've should've"))
        notes.add(NotesModel(title = "if you never looked my way.."))
        notes_list.layoutManager = LinearLayoutManager(this)

        //display number of notes
        var notesnumber = notes.size
        numberofnotes.text = "${notesnumber} notes"
        //////////////////////

        val i = Intent(this@MainActivity,MainActivity2::class.java)
        add_button.setOnClickListener {
            startActivity(i) }


        /*
        deleting process
        settings_ic.setOnClickListener {
            if (!notes.isEmpty())
            {notes.removeAt(0)
            notes_list.layoutManager = LinearLayoutManager(this)
            notes_list.adapter = NotesAdapter(notes,this,object : NotesAdapter.OnItemClickListener{
                override fun onItemClick(position: Int) {

                }
            })
            notes_number = notes.size
            numberofnotes.text = "$notes_number notes"}

        }
        */

        val recyclerView = notes_list
        val adapter = NotesAdapter(notes,this){ clickedItem ->
            val j = Intent(this@MainActivity,MainActivity2::class.java)
            j.putExtra("name",clickedItem.title.toString())
            startActivity(j)
            startActivity(i)

        }
        recyclerView.adapter = adapter

    }
}