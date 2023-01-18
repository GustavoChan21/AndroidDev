package com.example.comida.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.comida.DetailActivity
import com.example.comida.R

class DescriptionAdapter (var menu: List<Description>): RecyclerView.Adapter<DescriptionAdapter.myViewHolder>(){
    class myViewHolder (view:View): RecyclerView.ViewHolder(view){
        var titulo = view.findViewById<TextView>(R.id.titulo)
        var subtitulo = view.findViewById<TextView>(R.id.subtitulo)
        var precio = view.findViewById<TextView>(R.id.precio)
        var img = view.findViewById<ImageView>(R.id.img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.titulo.text = menu[position].titulo
        holder.subtitulo.text = menu[position].subtitulo
        holder.precio.text = menu[position].precio
        holder.img.setImageResource(menu[position].img)
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,DetailActivity::class.java)
            intent.putExtra("detalle", menu[position])
            holder.itemView.context.startActivity(intent)

        }
    }


    override fun getItemCount(): Int {
        return menu.size
    }
}


