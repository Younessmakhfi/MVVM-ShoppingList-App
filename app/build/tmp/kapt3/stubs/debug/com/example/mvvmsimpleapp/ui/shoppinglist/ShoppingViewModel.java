package com.example.mvvmsimpleapp.ui.shoppinglist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/mvvmsimpleapp/ui/shoppinglist/ShoppingViewModel;", "Landroidx/lifecycle/ViewModel;", "reporsitory", "Lcom/example/mvvmsimpleapp/data/reporsitories/ShoppingReporsitory;", "(Lcom/example/mvvmsimpleapp/data/reporsitories/ShoppingReporsitory;)V", "delete", "Lkotlinx/coroutines/Job;", "item", "Lcom/example/mvvmsimpleapp/data/db/entities/ShoppingItem;", "getAllShoppingItems", "Landroidx/lifecycle/LiveData;", "", "upsert", "app_debug"})
public final class ShoppingViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.mvvmsimpleapp.data.reporsitories.ShoppingReporsitory reporsitory = null;
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job upsert(@org.jetbrains.annotations.NotNull
    com.example.mvvmsimpleapp.data.db.entities.ShoppingItem item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull
    com.example.mvvmsimpleapp.data.db.entities.ShoppingItem item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mvvmsimpleapp.data.db.entities.ShoppingItem>> getAllShoppingItems() {
        return null;
    }
    
    public ShoppingViewModel(@org.jetbrains.annotations.NotNull
    com.example.mvvmsimpleapp.data.reporsitories.ShoppingReporsitory reporsitory) {
        super();
    }
}