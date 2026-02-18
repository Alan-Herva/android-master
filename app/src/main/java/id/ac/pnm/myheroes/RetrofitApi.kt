package id.ac.pnm.myheroes

import id.ac.pnm.myheroes.services.api.HeroService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitApi {

    private const val BASE_URL = "http://indonesia-public-static-api.vercel.app"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val heroService: HeroService by lazy {
        retrofit.create(HeroService::class.java)
    }
}