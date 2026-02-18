package id.ac.pnm.myheroes.model

import com.google.gson.annotations.SerializedName

data class Hero(
    val name: String? = null,
    @SerializedName("death_year")
    val deathYear: Int? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("ascension_year")
    val ascensionYear: Int? = null,
    @SerializedName("birth_year")
    val birthYear: Int? = null
)
