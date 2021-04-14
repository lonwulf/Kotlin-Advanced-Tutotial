/**
 * As input increases, so does time
 * O(n)
 */

fun main() {
    printNames(listOf("ken", "nduta", "tim"))
}

fun printNames(names: List<String>) {
    for (name in names) {
        println(name)
    }
}