package id.ac.pnm.myheroes

import id.ac.pnm.myheroes.services.api.BooksService
import id.ac.pnm.myheroes.services.api.HeroService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object BooksApi {
    private const val BASE_URL = "https://potterapi-fedeperin.vercel.app/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

//    val serviceBooks = retrofit.create(BooksService::class.java)

    val serviceBooks: BooksService by lazy {
        retrofit.create(BooksService::class.java)
    }
}