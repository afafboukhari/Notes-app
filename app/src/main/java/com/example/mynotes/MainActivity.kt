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
import kotlinx.android.synthetic.main.activity_main.textView11
import kotlinx.android.synthetic.main.activity_main2.Title

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val notes : ArrayList<NotesModel> = ArrayList()
        notes.add(NotesModel(title = "Hehehehe"))
        notes.add(NotesModel(title = "Hohohohohohoho"))
        notes.add(NotesModel(title = "to do list"))
        notes.add(NotesModel(title = "what to buy"))
        notes_list.layoutManager = LinearLayoutManager(this)

        val contenu : ArrayList<ContentModel> = ArrayList()
        contenu.add(ContentModel(contenu = "Ehehehehehehehe"))
        contenu.add(ContentModel(contenu = "Ohohohohohohohoho"))
        contenu.add(ContentModel(contenu = "sleep\neat\nannoy manal"))
        contenu.add(ContentModel(contenu = "creme\nglasses\nnew coat hahahahahaha"))

        //display number of notes
        var notesnumber = notes.size
        numberofnotes.text = "${notesnumber} notes"
        //////////////////////

        val i = Intent(this@MainActivity,MainActivity2::class.java)
        add_button.setOnClickListener {
            startActivity(i)
            Log.e("add","error")
        }


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
            val i = Intent(this@MainActivity,MainActivity2::class.java)
            j.putExtra("name",clickedItem.title)
            startActivity(i)
            startActivity(j)
        }
        recyclerView.adapter = adapter

    }
}