import readInput

fun main() {
    fun part1(input: List<String>): Int {
        val columns = input[0].indices
        val gammaRate = buildString {
            for (column in columns) {
                val (zeroes, ones) = input.countBitsInColumn(column)
                val commonBit = if (zeroes > ones) "0" else "1"
                append(commonBit)
            }
        }

        return gammaRate.toInt(2)
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("DayXX_test")
    check(part1(testInput) == 1)

    val input = readInput("DayXX")
    println(part1(input))

    check(part2(testInput) == 1)
    println(part2(input))
}

private fun List<String>.countBitsInColumn(column: Int): BitCount {
    var zeroes = 0
    var ones = 0
    for (line in this) {
        if (line[column] == '0') zeroes++ else ones++
    }
    return BitCount(zeroes, ones)
}

data class BitCount(val zeroes: Int, val ones: Int)