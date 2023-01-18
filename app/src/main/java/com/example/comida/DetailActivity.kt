package com.example.comida

import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.comida.Adapters.Description

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAGS_CHANGED)
            window.statusBarColor = ContextCompat.getColor(this, R.color.newbar2)
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val menu:Description = intent.getSerializableExtra("detalle") as Description

        val comida = findViewById<ImageView>(R.id.img)
        comida.setImageResource(menu.img)

        val titulo_info = findViewById<TextView>(R.id.titulo_info)
        titulo_info.setText(menu.titulo)

        val comida_info = findViewById<TextView>(R.id.comida_info)
        comida_info.setText(menu.subtitulo)

        val precio = findViewById<TextView>(R.id.precio)
        precio.setText(menu.precio)

        val detalles_info = findViewById<TextView>(R.id.detalles_info)
        detalles_info.setText(menu.descripcion)

        val ingredientes = findViewById<TextView>(R.id.detalles_ingredientes)
        ingredientes.setText(menu.ingredientes)

    }
}
