package id.ac.pnm.myheroes

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import id.ac.pnm.myheroes.model.Hero
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        RetrofitApi.heroService.getHeroes().enqueue(object: Callback<List<Hero>>{
            override fun onResponse(
                call: Call<List<Hero>>,
                response: Response<List<Hero>>
            ) {
                if (!response.isSuccessful){
                    println("error onResponse")
                }

                val heroes = response.body()

                if (heroes != null) {
                    for (hero in heroes){
                        println(hero.name)
                    }
                }

            }

            override fun onFailure(
                call: Call<List<Hero>>,
                t: Throwable
            ) {
                println("error")
//                TODO("Not yet implemented")
            }

        })

//        lifecycleScope.launch {
//            val heroes = RetrofitApi.heroService.getHeroes("")
//            for (hero in heroes){
//                println(hero.name)
//            }
//        }

    }
}