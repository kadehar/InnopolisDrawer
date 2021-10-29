package com.github.kadehar.innopolisdrawer.base

import androidx.annotation.ColorRes
import com.github.kadehar.innopolisdrawer.R

enum class COLOR(@ColorRes val value: Int) {
    BLACK(R.color.black),
    RED(R.color.paint_red),
    BLUE(R.color.paint_blue);

    companion object {
        private val map = values().associateBy(COLOR::value)
        fun from(color: Int) = map[color] ?: BLACK
    }
}