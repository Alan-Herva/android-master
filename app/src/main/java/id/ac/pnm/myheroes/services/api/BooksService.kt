package id.ac.pnm.myheroes.services.api

import id.ac.pnm.myheroes.model.Books
import id.ac.pnm.myheroes.model.Hero
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface BooksService {

    @GET("{lang}/books")
    suspend fun getAllBooks(@Path("lang") language : String = "en"): List<Books>
}