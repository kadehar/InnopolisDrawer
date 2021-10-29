package com.github.kadehar.innopolisdrawer.feature.di

import com.github.kadehar.innopolisdrawer.feature.canvas.CanvasFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val canvasModule = module {
    viewModel<CanvasFragmentViewModel> {
        CanvasFragmentViewModel()
    }
}