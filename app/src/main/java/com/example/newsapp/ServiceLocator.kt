package com.example.newsapp

import com.example.newsapp.data.NewsDatabase
import com.example.newsapp.NewsRepository
import android.app.Application

object ServiceLocator {
    lateinit var repository: NewsRepository
        private set

    fun init(app: Application) {
        val db = NewsDatabase.get(app)
        repository = NewsRepository(
            api = RetrofitClient.api,
            dao = db.newsDao()
        )
    }
}