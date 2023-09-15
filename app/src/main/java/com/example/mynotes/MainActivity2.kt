package com.example.mynotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main2.Title
import kotlinx.android.synthetic.main.activity_main2.back_button
import kotlinx.android.synthetic.main.activity_main2.content_list

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val data  = intent.extras!!.get("name")
        Title.text = data.toString()
        val paragraph : ArrayList<ContentModel> = ArrayList()
        paragraph.add(ContentModel(contenu = "1\n" +
                " 2\n" +
                " 3\n" +
                " 4\n" +
                " 5\n" +
                " 6\n" +
                " 7\n" +
                " 8\n" +
                " 9\n" +
                " 10\n" +
                " 11\n" +
                " 12\n" +
                " 14\n" +
                " 15\n" +
                " 16\n" +
                " 17\n" +
                " 18\n" +
                " 19\n" +
                " 20\n" +
                " 21\n" +
                " 22\n" +
                " 23\n" +
                " 24\n" +
                " 25"
                ))
        content_list.layoutManager = LinearLayoutManager(this)
        content_list.adapter = ContentAdapter(paragraph,this)

        back_button.setOnClickListener {
            val i = Intent(this@MainActivity2,MainActivity::class.java)
            startActivity(i)
        }
    }
}