package com.milictg.shoppinglist.ui.shoppingList

import com.milictg.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {

    fun onButtonClicked(item: ShoppingItem)
}