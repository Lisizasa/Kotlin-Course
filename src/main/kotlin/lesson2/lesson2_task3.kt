package lesson2

fun main() {
    val departureHour: Int = 9
    val departureMinute: Int = 39
    val travelTime: Int = 457

    val arrivalTimeInMinutes: Int = departureHour * MINUTES_IN_HOUR + departureMinute + travelTime

    val arrivalHour: Int = arrivalTimeInMinutes / MINUTES_IN_HOUR
    val arrivalMinute: Int = arrivalTimeInMinutes % MINUTES_IN_HOUR

    println(String.format("Время прибытия: %02d:%02d", arrivalHour, arrivalMinute))
}
const val MINUTES_IN_HOUR = 60