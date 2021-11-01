package com.github.kadehar.innopolisdrawer

import android.content.Context
import android.util.AttributeSet
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.kadehar.innopolisdrawer.base.setAdapterAndCleanupOnDetachFromWindow
import com.github.kadehar.innopolisdrawer.base.setData
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter

class ToolsLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    private var onClick: (Int) -> Unit = {}

    private val adapterDelegate = ListDelegationAdapter(colorAdapterDelegate {
        onClick(it)
    })

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        findViewById<RecyclerView>(R.id.toolsList).apply {
            layoutManager = LinearLayoutManager(
                context,
                RecyclerView.HORIZONTAL,
                false
            )
            setAdapterAndCleanupOnDetachFromWindow(adapterDelegate)
        }
    }

    fun render(toolsItems: List<ToolsItem>) {
        adapterDelegate.setData(toolsItems)
    }

    fun setOnClickListener(onClick: (Int) -> Unit) {
        this.onClick = onClick
    }
}