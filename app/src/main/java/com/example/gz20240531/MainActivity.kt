package com.example.gz20240531

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gz20240531.databinding.ActivityMainBinding
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: InstaAdapter
    private var itemList: ArrayList<InstaModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listItem.adapter=adapter

        itemList = getInitialData()
        initInstaAdapter(itemList)

        val viewModel = null
    }

    private fun getInitialData(): ArrayList<InstaModel> {
        val sdf = SimpleDateFormat("MM월 dd일")
        val list = arrayListOf<InstaModel>()
        for (i in 0..<10) {
            list.add(
                InstaModel(
                    imgUrl = arrayListOf("https://picsum.photos/200/200"), // sample image url
                    likeCnt = i,
                    id = "thisIsId$i",
                    description = "This Is Description : $i",
                    commentCnt = i,
                    date = sdf.format(java.util.Date()),
                    isLiked = i % 2 == 0,
                    isBookMarked = i % 3 == 0,
                )
            )
        }
        return list
    }

    private fun initInstaAdapter(itemList: ArrayList<InstaModel>) {
        adapter = InstaAdapter(
            activity = this,
            itemList = itemList,
        )
    }

}

