package id.ac.pnm.myheroes.model

import android.os.Parcelable

data class Pahlawan(
	val name: String? = null,
	val deathYear: Int? = null,
	val description: String? = null,
	val ascensionYear: Int? = null,
	val birthYear: Int? = null
)
