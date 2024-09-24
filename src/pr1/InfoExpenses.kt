package pr1

class InfoExpenses(
    val sum: Int,
    val category: String,
    val date: String,
) {
    fun show() {
        println("Сумма расхода - $sum₽\nКатегория - $category\nДата - $date")
    }
}