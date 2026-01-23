package lesson4

fun main() {
    val tablesInRestaurant: Int = 13
    val tablesBookedToday: Int = 13
    val tablesBookedTomorrow: Int = 9

    println("Доступность столиков на сегодня: ${tablesBookedToday < tablesInRestaurant}")
    println("Доступность столиков на сегодня: ${tablesBookedTomorrow < tablesInRestaurant}")

}