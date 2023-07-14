package com.example.prjobat2020009.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prjobat2020009.R
import com.example.prjobat2020009.model.BarangModel
import com.squareup.picasso.Picasso
import kotlin.collections.ArrayList


class AdapterBarang (var activity: Activity, var data: ArrayList<BarangModel>): RecyclerView.Adapter<AdapterBarang.Holder>() {
    class Holder(view: View): RecyclerView.ViewHolder(view) {
        val tvKodeObat = view.findViewById<TextView>(R.id.tvkodeobat)
        val tvJenis = view.findViewById<TextView>(R.id.tvjenis)
        val tvPabrik = view.findViewById<TextView> (R.id.tvpabrik)
        val tvHarga = view.findViewById<TextView> (R.id.tvharga)
        val imgProduk = view.findViewById<ImageView> (R.id.img_produk)
    }

    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.obat, parent,false)
        return Holder(view)
    }

    @SuppressLint("SetText18n")
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val a = data[position]

        holder.tvKodeObat.text = a.kodeobat
        holder.tvHarga.text = a.harga
        holder.tvJenis.text = a.jenis
        holder.tvPabrik.text = a.pabrik

        val image = "http://192.168.230.222/latihanam2020009/public/storage/image/${a.image}"
     Picasso.get()
         .load(image)
         .into(holder.imgProduk)

    }

    override fun getItemCount(): Int {
        return data.size
    }

}