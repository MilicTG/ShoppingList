package com.milictg.shoppinglist.ui.shoppingList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.milictg.shoppinglist.data.db.ShoppingDatabase
import com.milictg.shoppinglist.data.repositories.ShoppingRepository

@Suppress("UNCHECKED_CAST")
class ShoppingModelFactory(private val repository: ShoppingRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repository) as T
    }
}