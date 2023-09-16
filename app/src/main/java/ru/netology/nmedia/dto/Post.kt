package ru.netology.nmedia.dto

data class Post(
    var id: Int = 0,
    var author: String = "",
    var content: String = "",
    var published: String = "",
    var likedByMe: Boolean = false,
    var likes: Int = 999,
    var shares: Int = 999
) {

}
