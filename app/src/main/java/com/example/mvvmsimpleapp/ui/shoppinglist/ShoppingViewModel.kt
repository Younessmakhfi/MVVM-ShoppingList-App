package com.example.mvvmsimpleapp.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.example.mvvmsimpleapp.data.db.entities.ShoppingItem
import com.example.mvvmsimpleapp.data.reporsitories.ShoppingReporsitory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(private val reporsitory: ShoppingReporsitory) : ViewModel() {
    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        reporsitory.upset(item)
    }
    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        reporsitory.delete(item)
    }
    fun getAllShoppingItems() = reporsitory.getAllShoppingItems()

}