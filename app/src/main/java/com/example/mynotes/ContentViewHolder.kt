package com.example.mynotes

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.content.view.paragraphe

class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val content : TextView? = itemView.paragraphe
}