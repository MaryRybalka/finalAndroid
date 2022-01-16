package com.example.menu.viewmodels

import com.airbnb.epoxy.EpoxyController
import com.example.menu.models.Item
import com.example.menu.models.ItemDataFactory
import com.example.menu.models.epoxy.SingleItemModel_


class SingleItemController : EpoxyController(){

    private var items : List<Item> = ItemDataFactory.getItems(8)
    private var index = 0L

    override fun buildModels() = items.forEach{
        SingleItemModel_(it)
            .id(index++)
            .addTo(this)
    }
}