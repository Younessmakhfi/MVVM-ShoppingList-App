package com.example.mvvmsimpleapp.ui.shoppinglist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/mvvmsimpleapp/ui/shoppinglist/AddDialogListener;", "", "onAddButtonClicked", "", "item", "Lcom/example/mvvmsimpleapp/data/db/entities/ShoppingItem;", "app_debug"})
public abstract interface AddDialogListener {
    
    public abstract void onAddButtonClicked(@org.jetbrains.annotations.NotNull
    com.example.mvvmsimpleapp.data.db.entities.ShoppingItem item);
}