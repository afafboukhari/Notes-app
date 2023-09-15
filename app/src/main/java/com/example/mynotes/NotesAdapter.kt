package com.example.mynotes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotesAdapter(var data: ArrayList<NotesModel>, var context: Context, private val onItemClick: (NotesModel) -> Unit) :
    RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        return NotesViewHolder(LayoutInflater.from(context).inflate(R.layout.note, parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        holder.bind(data[position])
    }

    // Handle the clicks:
    inner class NotesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.title)

        fun bind(note: NotesModel) {
            titleTextView.text = note.title

            // Set up the click listener here
            itemView.setOnClickListener {
                onItemClick(note)
            }
        }
    }
}
