package com.example.mvvmsimpleapp.ui.shoppinglist

import com.example.mvvmsimpleapp.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}