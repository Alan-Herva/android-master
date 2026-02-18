@Parcelize
data class Pahlawan(
	val pahlawan: List<PahlawanItem?>? = null
) : Parcelable

@Parcelize
data class PahlawanItem(
	val name: String? = null,
	val deathYear: Int? = null,
	val description: String? = null,
	val ascensionYear: Int? = null,
	val birthYear: Int? = null
) : Parcelable

