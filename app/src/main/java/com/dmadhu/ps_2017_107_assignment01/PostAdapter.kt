package com.dmadhu.ps_2017_107_assignment01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(val postModel:MutableList<PostModel>): RecyclerView.Adapter<PostViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.card_post,parent,false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        return holder.bindView(postModel[position])
    }

    override fun getItemCount(): Int {
        return postModel.size
    }

}
class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val tvId: TextView =itemView.findViewById(R.id.tvId)
    private val tvTitle: TextView =itemView.findViewById(R.id.tvTitle)


    fun bindView(postModel: PostModel){
        tvId.text=postModel.id
        tvTitle.text=postModel.title

    }
}