package com.example.gz20240531

class InstaModel(
    val imgUrl: ArrayList<String>,
    val id: String,
    val description: String,
    var commentCnt: Int,
    val date: String,
    var isLiked: Boolean,
    var isBookMarked: Boolean,
    likeCnt: Int,
)