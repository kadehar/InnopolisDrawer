package com.github.kadehar.innopolisdrawer.feature.canvas

import com.github.kadehar.innopolisdrawer.ToolsItem
import com.github.kadehar.innopolisdrawer.base.Event

data class ViewState(
    val colors: List<ToolsItem.ColorModel>,
    val isPaletteVisible: Boolean,
    val canvasViewState: CanvasViewState
)

sealed class UiEvent : Event {
    object OnToolsClicked : UiEvent()
    data class OnColorClicked(val index: Int) : UiEvent()
}