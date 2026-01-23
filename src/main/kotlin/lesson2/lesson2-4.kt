package lesson2

fun main() {
    val crystals: Int = 7
    val iron: Int = 11
    val percent: Double = 20.0

    println("Кристаллическая руда: ${(crystals * (percent / PERCENT_DIVIDER)).toInt()}")
    println("Железная руда: ${(iron * (percent / PERCENT_DIVIDER)).toInt()}")
}
const val PERCENT_DIVIDER: Double = 100.0