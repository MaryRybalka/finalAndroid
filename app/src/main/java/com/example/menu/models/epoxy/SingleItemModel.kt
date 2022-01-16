package com.example.menu.models.epoxy

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.menu.R
import com.example.menu.models.Item
import com.example.menu.models.ItemDataFactory
import com.squareup.picasso.Picasso


@EpoxyModelClass(layout = R.layout.singleitem_layout)
abstract class SingleItemModel (@EpoxyAttribute var item: Item) : EpoxyModelWithHolder<SingleItemModel.ItemHolder>(){

    override fun bind(holder: ItemHolder) {
        val grid = ItemDataFactory.random.nextInt(8)
        Picasso.get()
            .load("https://random.imagecdn.app/500/17$grid")
            .resize(150, 150)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(item.image)
            .into(holder.imageView);
        holder.titleView.text = item.title
        holder.descView.text = item.desc
        holder.itemField.setBackgroundResource(item.border)
    }

    inner class ItemHolder : KotlinHolder(){
        val imageView by bind<ImageView>(R.id.image)
        val titleView by bind<TextView>(R.id.title)
        val descView by bind<TextView>(R.id.desc)
        val itemField by bind<ConstraintLayout>(R.id.item_field)
    }

}