package pr1

class Dish(
    val id: Int,
    val name: String,
    val category: String,
    val ingredients: List<String>,
    val inFavorites: Boolean = false
) {
    fun addToFavorites() {
        println("Блюдо $name удалено из избранного")
    }
}