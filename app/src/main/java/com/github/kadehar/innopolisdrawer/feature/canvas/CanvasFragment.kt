package com.github.kadehar.innopolisdrawer.feature.canvas

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.kadehar.innopolisdrawer.R
import com.github.kadehar.innopolisdrawer.ToolsLayout
import com.github.kadehar.innopolisdrawer.databinding.FragmentCanvasBinding

class CanvasFragment : Fragment(R.layout.fragment_canvas) {
    companion object {
        private const val PALETTE = 0

        fun newInstance() = CanvasFragment()
    }

    private val binding: FragmentCanvasBinding by viewBinding(FragmentCanvasBinding::bind)
    private lateinit var toolsLayouts: List<ToolsLayout>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        toolsLayouts = listOf(binding.palette as ToolsLayout)
    }
}