package com.example.gz20240531

import android.app.Activity
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.gz20240531.databinding.ItemBinding

class InstaAdapter (
    private var activity: Activity,
    private var itemList: ArrayList<InstaModel> = arrayListOf(),
    private var onClickLike: ((Int) -> Unit)? = null,
    private var onClickComment: ((Int) -> Unit)? = null,
    private var onClickDM: ((Int) -> Unit)? = null,
    private var onClickBookMark: ((Int) -> Unit)? = null,
    private var onClickCommentDirect: ((Int) -> Unit)? = null,
    private var onClickCommentAll: ((Int) -> Unit)? = null,
    private var onClickMore: ((Int) -> Unit)? = null,
    ): RecyclerView.Adapter<InstaAdapter.InstaHolder>() {

    inner class InstaHolder(b: ItemBinding) : RecyclerView.ViewHolder(b.root) {
        var itembinding: ItemBinding = b
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstaHolder {
        return InstaHolder(
            ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    override fun onBindViewHolder(holder: InstaHolder, position: Int) {
        val item = itemList[position]
        }
    }

