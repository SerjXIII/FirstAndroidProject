package ru.netology.nmedia.repository

import androidx.lifecycle.LiveData
import ru.netology.nmedia.dto.Post

interface PostRepository {
    fun shareById(id: Long)

    fun getAll() : LiveData<List<Post>>

    fun likeById(id: Long)
}

