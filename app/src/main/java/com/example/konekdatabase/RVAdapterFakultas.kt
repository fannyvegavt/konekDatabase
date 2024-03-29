package com.example.konekdatabase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fakultas_list.view.*

class RVAdapterFakultas (
    private val context: Context,
    private val arrayList: ArrayList<Fakultas>) :
    RecyclerView.Adapter<RVAdapterFakultas.Holder>() {

    class Holder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.fakultas_list, parent, false))
    }

    override fun getItemCount(): Int = arrayList!!.size
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.view.kdfakultas.text =  arrayList?.get(position)?.kd_fakultas
        holder.view.nmfakultas.text = "Nama Fakultas : " + arrayList?.get(position)?.nama_fakultas
    }
}