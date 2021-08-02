package com.example.mvvmsimpleapp.ui.shoppinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmsimpleapp.data.reporsitories.ShoppingReporsitory

@Suppress("UNCHECKED_CAST")
class ShoppingViewModelFactory(private val reporsitory: ShoppingReporsitory
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoppingViewModel(reporsitory) as T
    }
}