package timeComplexities

/**
 * As input data increases the amount of time taken by the algorithm to run increases drastically
 * O(n^2)
 * They do not perform well at scale
 *
 * e.g print is called n*n/ n^2
 */

fun main() {
    multiplicationBoard(5)
}

fun multiplicationBoard(size: Int) {
    for (number in 1..size) {
        print(" | ")
        for (otherNumber in 1..size) {
            print("$number x $otherNumber = ${number * otherNumber} | ")
        }
        println()
    }
}
