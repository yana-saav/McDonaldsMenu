package com.example.mcdonaldsmenu.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.mcdonaldsmenu.databinding.MenuListItemBinding

class ArticleAdapter(val onClick:(dish_item: ArticleModel)->Unit): RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {
    val list = ArrayList<ArticleModel>()
    fun setData(newList: List<ArticleModel>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = MenuListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val currentElement = list[position]
        var requestOptions = RequestOptions()
        requestOptions = requestOptions.transforms(CenterCrop(), RoundedCorners(16))
        Glide.with(holder.binding.dishImage.context).load(currentElement.image)
            .apply(requestOptions)
            .into(holder.binding.dishImage)
        holder.bindItem(currentElement)
    }
    override fun getItemCount(): Int {
        return list.size
    }

    inner class ArticleViewHolder(
        val binding: MenuListItemBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bindItem(model: ArticleModel){
            binding.h2.text=model.title
            binding.price.text=model.price
            binding.listItem.setOnClickListener{
                onClick(model)
            }
        }
    }
}