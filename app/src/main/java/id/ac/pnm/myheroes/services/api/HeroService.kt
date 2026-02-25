package id.ac.pnm.myheroes.services.api

import id.ac.pnm.myheroes.model.Hero
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface HeroService {

    @GET("/api/heroes")
    fun getHeroes(): Call<List<Hero>>

    @GET("/api/heroes")
    suspend fun getHeroes(@Query("name") name :String) : List<Hero>

}