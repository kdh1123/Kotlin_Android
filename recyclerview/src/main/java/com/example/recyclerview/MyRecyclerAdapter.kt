package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerAdapter: RecyclerView.Adapter<MyViewHolder>() {

    private var modelList =  ArrayList<MyModel>()

    //뷰홀더가 생성되었을 때
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        //연결할 레이아웃 설정

        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_recyclerview_item, parent))
    }

    //목록의 아이템 수
    override fun getItemCount(): Int {
        return 5
    }

    //뷰와 뷰홀더가 묶였을 때,
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(this.modelList[position])
    }


    fun submitList(modelList: ArrayList<MyModel>){
        this.modelList = modelList
    }
}