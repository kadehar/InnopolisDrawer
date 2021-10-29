package com.github.kadehar.innopolisdrawer

import androidx.annotation.ColorRes
import com.github.kadehar.innopolisdrawer.base.Item

sealed class ToolsItem : Item {
    data class ColorModel(@ColorRes val color: Int) : ToolsItem()
}
