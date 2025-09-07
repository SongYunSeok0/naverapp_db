package com.example.newsapp

import com.example.newsapp.data.NewsDao
import kotlinx.coroutines.flow.Flow

class NewsRepository(
    private val api: NaverNewsApi,
    private val dao: NewsDao
) {
    fun observeNews(): Flow<List<NewsItem>> = dao.observeAll()

    suspend fun searchAndCache(query: String) {
        val dto = api.searchNews(query)
        dao.delete()
        dao.upsertAll(dto.items)
    }
}