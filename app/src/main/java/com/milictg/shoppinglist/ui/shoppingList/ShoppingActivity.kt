package com.milictg.shoppinglist.ui.shoppingList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.milictg.shoppinglist.R
import com.milictg.shoppinglist.data.db.ShoppingDatabase
import com.milictg.shoppinglist.data.repositories.ShoppingRepository

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val database = ShoppingDatabase(this)
        val repository = ShoppingRepository(database)
        val factory = ShoppingModelFactory(repository)

        val viewModel = ViewModelProvider(this, factory).get(ShoppingViewModel::class.java)
    }
}