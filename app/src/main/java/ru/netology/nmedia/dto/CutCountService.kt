package ru.netology.nmedia.dto

import kotlin.math.floor

object CutCountService {
    fun getCount(count: Int): String {
        return when (true) {
            (count in 1000..1099) -> "1K"
            (count in 1100..9999) -> "${floor(count.toDouble() / 100) / 10}K"
            (count in 10_000..999_999) -> "${count / 1000}K"
            (count in 1_000_000..1_099_999) -> "1M"
            (count > 1_099_999) -> "${floor(count.toDouble() / 100_000) / 10}M"
            else -> "$count"
        }

    }
}