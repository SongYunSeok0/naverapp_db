package com.example.newsapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.collectLatest

class NewsViewModel() : ViewModel() {
    private val repository: NewsRepository = ServiceLocator.repository
    private val _newsList = MutableStateFlow<List<NewsItem>>(emptyList())
    val newsList: StateFlow<List<NewsItem>> = _newsList

    init {
        viewModelScope.launch {
            repository.observeNews().collectLatest { items ->
                _newsList.value = items
            }
        }
    }

    fun naverFetchNews(query: String) {
        viewModelScope.launch {
            try {
                repository.searchAndCache(query)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}