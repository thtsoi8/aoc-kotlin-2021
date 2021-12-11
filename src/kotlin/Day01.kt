fun main() {
    fun part1(input: List<Int>): Int {
        return input.windowed(2).count { (a, b) -> a < b }
    }

    // A + B + C <=> B + C + D
    fun part2(input: List<Int>): Int {
//        return input.windowed(3).windowed(2).count {
//            (a, b) -> a.sum() < b.sum()
//        }
        return input.windowed(4).count {
            it[0] < it[3]
        }
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 7)

    val input = readInputAsInt("Day01")
    println(part1(input))
    println(part2(input))
}
