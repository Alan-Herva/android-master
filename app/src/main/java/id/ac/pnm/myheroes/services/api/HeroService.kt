package id.ac.pnm.myheroes.services.api

import id.ac.pnm.myheroes.model.Hero
import retrofit2.http.GET
import retrofit2.http.Query

interface HeroService {

    @GET("/api/heroes")
    fun getHeroes(): List<Hero>

    @GET("/api/heroes")
    fun getHeroes(@Query("name") name :String)

}