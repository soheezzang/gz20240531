package com.example.gz20240531

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gz20240531.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: InstaAdapter
    private var list: ArrayList<InstaModel> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val viewModel = null

    }

    private fun initInstaAdapter(itemList: ArrayList<InstaModel>) {
        adapter = InstaAdapter(
            activity = this,
            itemList = itemList,
        )
    }

}

