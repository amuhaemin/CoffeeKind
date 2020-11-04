package com.example.coffeekind

import adapter.ListCoffeeAdapter
import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import model.Coffee
import model.CoffeeData

class MainActivity : AppCompatActivity() {
    private lateinit var rvCoffee: RecyclerView
    private var list: ArrayList<Coffee> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCoffee = this.findViewById(R.id.rv_coffeekind)
        rvCoffee.setHasFixedSize(true)

        list.addAll(CoffeeData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList(){
        rvCoffee.layoutManager = LinearLayoutManager(this)
        val listCoffeeAdapter = ListCoffeeAdapter(list)
        rvCoffee.adapter = listCoffeeAdapter

        listCoffeeAdapter.setOnItemClickCallback(object : ListCoffeeAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Coffee) {
                showSelectedCoffee(data)
            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id:Int = item.itemId
        if (id == R.id.about){
            val intent = Intent(this, AccountInfo::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

    fun showSelectedCoffee(coffee: Coffee){
        if (coffee.name == "Kopi Tubruk"){
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
        else{
            Toast.makeText(this, "Kamu memilih " + coffee.name, Toast.LENGTH_SHORT).show()

        }
    }

}
