package com.example.newsapp

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import androidx.room.Entity
import androidx.room.PrimaryKey

data class NaverNewsDto(
    val lastBuildDate: String,
    val total: Int,
    val start: Int,
    val display: Int,
    val items: List<NewsItem>
)

@Entity(tableName = "news")
data class NewsItem(
    val title: String,
    val originallink: String,
    @PrimaryKey val link: String,
    val description: String,
    val pubDate: String
)

interface NaverNewsApi {
    @Headers(
        "X-Naver-Client-Id: OJZfWV6hLr_nkbJv5zCr",
        "X-Naver-Client-Secret: b4STaau4ei"
    )
    @GET("v1/search/news.json")
    suspend fun searchNews(
        @Query("query") query: String,
        @Query("display") display: Int = 10,
        @Query("start") start: Int = 1,
        @Query("sort") sort: String = "sim",
    ): NaverNewsDto
}