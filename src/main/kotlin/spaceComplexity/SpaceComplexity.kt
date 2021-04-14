package spaceComplexity

/**
 * This is a measure of the amount of memory used
 */
fun main() {
    /**
     * space complexity is O(n) i.e. ant entire list is allocated to create the sort representation of the source array
     */
    printSortedV1(listOf(1, 3, 23, 45, 656, 123, 56))
    /**
     * space complexity is  O(1) i.e. memory is only allocated for a few variables
     */
    printSortedV2(listOf(1, 3, 23, 45, 656, 123, 56))
}

//version 1
fun printSortedV1(numbers: List<Int>) {
    val sorted = numbers.sorted()
    sorted.forEach { println(it) }
}

//version2
fun printSortedV2(numbers: List<Int>) {
    if (numbers.isEmpty()) return
    var currentCount = 0
    var minValue = Int.MIN_VALUE
    numbers.forEach { value ->
        if (value == minValue) {
            println(value)
            currentCount += 1
        }
    }
    while (currentCount < numbers.size) {
        var currentValue = numbers.max()!!
        numbers.forEach { value ->
            if (value < currentValue && value > minValue) {
                currentValue = value
            }
        }
        numbers.forEach { value ->
            if (value == currentValue) {
                println(value)
                currentCount += 1
            }
        }
        minValue = currentValue
    }
}


