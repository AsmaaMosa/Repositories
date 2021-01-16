package com.repositories.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repositories.R
import com.repositories.domain.model.ItemModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layout_repository_item.view.*

class GithubRepositoriesAdapter(var repos: MutableList<ItemModel>) :
    RecyclerView.Adapter<GithubRepositoriesAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_repository_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return repos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val repoItem = repos[position]
        with(holder.itemView) {
            tv_name.text = repoItem.name
            tv_desc.text = repoItem.description
            Picasso.get().load(repoItem.owner.avatar_url).into(img_Avatar)
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}

