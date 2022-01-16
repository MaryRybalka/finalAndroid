package com.example.menu.models

import android.graphics.Color
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.menu.R

open class Item (
    @DrawableRes val image:Int = -1,
    val title:String="",
    val desc:String="",
    @DrawableRes val border:Int = R.drawable.item_field_blue
)