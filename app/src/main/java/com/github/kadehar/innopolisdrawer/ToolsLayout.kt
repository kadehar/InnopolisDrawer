package com.github.kadehar.innopolisdrawer

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.kadehar.innopolisdrawer.databinding.ToolsViewBinding

class ToolsLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    private val binding: ToolsViewBinding =
        ToolsViewBinding.inflate(
            LayoutInflater.from(context),
            this, true
        )

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        binding.toolsList.apply {
            layoutManager = LinearLayoutManager(
                context,
                RecyclerView.HORIZONTAL,
                false
            )
        }
    }

}