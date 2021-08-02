package com.example.mvvmsimpleapp.data.reporsitories

import com.example.mvvmsimpleapp.data.db.ShoppingDatabase
import com.example.mvvmsimpleapp.data.db.entities.ShoppingItem

class ShoppingReporsitory(private val db: ShoppingDatabase) {
    suspend fun upset(item: ShoppingItem) = db.getShoppingDao().upsert(item)
    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)
    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems();
}