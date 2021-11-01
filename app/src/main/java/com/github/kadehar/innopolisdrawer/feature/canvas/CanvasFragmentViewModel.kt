package com.github.kadehar.innopolisdrawer.feature.canvas

import com.github.kadehar.innopolisdrawer.ToolsItem
import com.github.kadehar.innopolisdrawer.base.BaseViewModel
import com.github.kadehar.innopolisdrawer.base.COLOR
import com.github.kadehar.innopolisdrawer.base.Event

class CanvasFragmentViewModel : BaseViewModel<ViewState>() {
    override fun initialViewState(): ViewState = ViewState(
        colors = enumValues<COLOR>().map { ToolsItem.ColorModel(it.value) },
        isPaletteVisible = false,
        canvasViewState = CanvasViewState(COLOR.BLACK)
    )

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is UiEvent.OnToolsClicked -> {
                return previousState.copy(isPaletteVisible = !previousState.isPaletteVisible)
            }
            is UiEvent.OnColorClicked -> {
                return previousState.copy(
                    canvasViewState =
                    previousState.canvasViewState.copy(
                        color = COLOR.from(
                            previousState.colors[event.index].color
                        )
                    ),
                    isPaletteVisible = !previousState.isPaletteVisible
                )
            }
        }

        return null
    }
}