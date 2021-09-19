package com.muazzeznihalbahadir.cicekkitabi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter (val cicekListesi : ArrayList<String>,val cicekGorseli : ArrayList<Int>): RecyclerView.Adapter<RecyclerAdapter.CiceklerVH>() {
    class CiceklerVH (itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CiceklerVH {
      val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
      return CiceklerVH(itemView)
    }

    override fun onBindViewHolder(holder: CiceklerVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = cicekListesi.get(position)
        holder.itemView.setOnClickListener{
            val intent = Intent(
                holder.itemView.context,TanitimActivity::class.java
            )
            intent.putExtra("cicekIsmi",cicekListesi.get(position))
            intent.putExtra("cicekGorseli",cicekGorseli.get(position))
           /* val singleton = SingletonClass.SecilenCicek
            singleton.görsel=cicekGorseli.get(position)*/
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return cicekListesi.size
    }


}