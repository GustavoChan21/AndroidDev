package com.example.comida

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comida.Adapters.Description
import com.example.comida.Adapters.DescriptionAdapter
import com.example.comida.Adapters.setData
import com.example.comida.network.ApiClient
import com.example.comida.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    //variables_locales
    lateinit var request: ApiInterface
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
    //Aspect control of the status bar
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAGS_CHANGED)
            window.statusBarColor = ContextCompat.getColor(this, R.color.newbar)
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        request = ApiClient.buildService(ApiInterface::class.java)

        recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        getAlimentos()
    }

    fun getAlimentos(){
        val call = request.getAlimentos()
        call.enqueue(object :Callback<ArrayList<Description>>{
            override fun onResponse(
                call: Call<ArrayList<Description>>,
                response: Response<ArrayList<Description>>
            ) {
                if (!response.body()!!.isEmpty()){
                    recyclerView.adapter = DescriptionAdapter(response.body()!!)
                }else{
                    Toast.makeText(this@MainActivity, "No se encontro la información JSON del Server", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<ArrayList<Description>>, t: Throwable) {
                Toast.makeText(this@MainActivity, t.stackTraceToString(), Toast.LENGTH_SHORT).show()
            }

        })
    }
}