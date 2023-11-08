package com.example.googleplaystore

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rcvCategory: RecyclerView
    private lateinit var categoryAdapter: CategoryAdapter

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcvCategory = findViewById(R.id.rcv_category)

        val linearLayoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        categoryAdapter = CategoryAdapter(this, getListCategory())

        rcvCategory.layoutManager = linearLayoutManager
        rcvCategory.adapter = categoryAdapter
    }

    private fun getListCategory(): List<Category> {
        val listCategory = mutableListOf<Category>()
        val listApp = mutableListOf<App>()
        listApp.add(App(R.drawable.facebook, "Facebook"))
        listApp.add(App(R.drawable.tiktok, "Tiktok"))
        listApp.add(App(R.drawable.mxplayer, "Mx Player"))
        listApp.add(App(R.drawable.reddit_logo, "Reddit"))
        listApp.add(App(R.drawable.reddit_logo, "Reddit"))
        listApp.add(App(R.drawable.reddit_logo, "Reddit"))
        listApp.add(App(R.drawable.reddit_logo, "Reddit"))
        listApp.add(App(R.drawable.reddit_logo, "Reddit"))

        listCategory.add(Category("Social networking", listApp))
        listCategory.add(Category("Video editor & player", listApp))
        listCategory.add(Category("Category 3", listApp))
        listCategory.add(Category("Category 4", listApp))

        return listCategory
    }
}
