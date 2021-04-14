package timeComplexities
/**
 * Has the same running time regardless of the size of the input
 * as input data increases, amount of time taken by the algorithm does not change
 * O(1)
 */

fun main() {
    addItemToFirstIndex(4)
    checkFirst(listOf("ken", "tim", "nduts"))
}

fun addItemToFirstIndex(num: Int) {
    val list = mutableListOf<Int>(12, 14, 9, 0, 12)
    list.add(0, num)
}

fun checkFirst(names: List<String>) {
    if (names.firstOrNull() != null) {
        println(names.first())
    } else {
        println("no names")
    }
}