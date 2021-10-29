package com.github.kadehar.innopolisdrawer

import android.annotation.SuppressLint
import android.graphics.PorterDuff
import com.github.kadehar.innopolisdrawer.base.Item
import com.github.kadehar.innopolisdrawer.databinding.ItemPaletteBinding
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

@SuppressLint("NewApi")
fun colorAdapterDelegate(
    onClick: (Int) -> Unit
): AdapterDelegate<List<Item>> =
    adapterDelegateViewBinding<ToolsItem.ColorModel, Item, ItemPaletteBinding>(
        {
            layoutInflater, parent -> ItemPaletteBinding.inflate(layoutInflater, parent, false)
        }
    ) {
        bind {
            binding.color.setColorFilter(
                context.resources.getColor(item.color, null),
                PorterDuff.Mode.SRC_IN
            )
            itemView.setOnClickListener { onClick(adapterPosition) }
        }
    }