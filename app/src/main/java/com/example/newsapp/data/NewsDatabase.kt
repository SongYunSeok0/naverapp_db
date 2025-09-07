package com.example.newsapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.newsapp.NewsItem
import com.example.newsapp.data.NewsDatabase
import kotlin.synchronized

@Database(entities = [NewsItem::class], version = 1, exportSchema = false)
abstract class NewsDatabase : RoomDatabase() {
    abstract fun newsDao(): NewsDao

    companion object {
        @Volatile private var INSTANCE: NewsDatabase? = null
        fun get(context: Context): NewsDatabase = 
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    NewsDatabase::class.java, 
                    "news.db"
                ).build().also { INSTANCE = it}
            }
    }
}