package com.github.kadehar.innopolisdrawer.feature.canvas

import android.os.Bundle
import android.view.View
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import com.github.kadehar.innopolisdrawer.R
import com.github.kadehar.innopolisdrawer.ToolsLayout
import org.koin.androidx.viewmodel.ext.android.viewModel

class CanvasFragment : Fragment(R.layout.fragment_canvas) {
    companion object {
        private const val PALETTE = 0

        fun newInstance() = CanvasFragment()
    }

    private val viewModel by viewModel<CanvasFragmentViewModel>()

    private val toolsLayouts: List<ToolsLayout> by lazy {
        listOf(requireActivity().findViewById(R.id.palette))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolsLayouts[PALETTE].setOnClickListener {
            viewModel.processUiEvent(UiEvent.OnColorClicked(it))
        }
        viewModel.viewState.observe(viewLifecycleOwner, ::render)
    }

    private fun render(viewState: ViewState) {
        toolsLayouts[PALETTE].isGone = viewState.isPaletteVisible
        toolsLayouts[PALETTE].render(viewState.colors)

        requireActivity().findViewById<CustomDrawView>(R.id.drawView).render(viewState.canvasViewState)
    }
}