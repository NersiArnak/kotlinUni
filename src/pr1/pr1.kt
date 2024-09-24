package pr1

fun main() {
    val expenses1: InfoExpenses = InfoExpenses(
        sum = 100,
        category = "Развлечение",
        date = "24.09.2024"
    )
    var list = mutableListOf(expenses1)

    fun printExpenses(expenses: InfoExpenses) {
        println("Сумма расхода - $expenses.sum₽\nКатегория - $expenses.category\nДата - $expenses.date")
    }

    fun addExpenses(expenses: InfoExpenses) {
        list.add(expenses)
        for (i in list) {
            printExpenses(i)
        }
    }

    addExpenses(expenses1)
}