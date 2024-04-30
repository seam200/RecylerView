package com.example.recylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerview.databinding.ListItemBinding

class CompanyAdapter(private val companyList:ArrayList<Company>):RecyclerView.Adapter<CompanyAdapter.MyViewHolder>() {
    class MyViewHolder(val binding:ListItemBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return companyList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val company = companyList[position]
        holder.binding.companyName.text = company.companyName
        holder.binding.companyDetails.text = company.companyDetails
        holder.binding.companyLogo.setImageResource(company.companyLogo)
    }
    interface OnItemClickListener {
        fun onItemClick(company: Company)
    }
}