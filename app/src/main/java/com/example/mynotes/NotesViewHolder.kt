package com.example.mynotes

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.note.view.title

class NotesViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
    val titre : TextView = itemView.title }