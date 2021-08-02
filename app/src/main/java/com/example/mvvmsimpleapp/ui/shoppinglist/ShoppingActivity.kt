package com.example.mvvmsimpleapp.ui.shoppinglist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmsimpleapp.R
import com.example.mvvmsimpleapp.data.db.ShoppingDatabase
import com.example.mvvmsimpleapp.data.db.entities.ShoppingItem
import com.example.mvvmsimpleapp.data.reporsitories.ShoppingReporsitory
import com.example.mvvmsimpleapp.other.ShoppingItemAdapter
import kotlinx.android.synthetic.main.activity_shopping.*

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        val database = ShoppingDatabase(this);
        val reporsitory = ShoppingReporsitory(database);
        val factory = ShoppingViewModelFactory(reporsitory);
        val viewModel = ViewModelProviders.of(this,factory).get(ShoppingViewModel::class.java)
        val adapter = ShoppingItemAdapter(listOf(),viewModel)
        rvShoppingItems.layoutManager = LinearLayoutManager(this)
        rvShoppingItems.adapter = adapter
        viewModel.getAllShoppingItems().observe(this, Observer {
            adapter.items = it
            adapter.notifyDataSetChanged()
        })
        fab.setOnClickListener {
AddShoppingItemDialog(this,
    object : AddDialogListener{
        override fun onAddButtonClicked(item: ShoppingItem) {
            viewModel.upsert(item)
        }
}).show()
        }
    }
}