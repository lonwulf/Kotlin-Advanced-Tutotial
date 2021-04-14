package timeComplexities

/**
 *These algorithms leverage on making some assumptions about the input data
 *O(log n)
 * e.g. if you had a sorted list of integers, what is the quickest way to find if a
 *particular value exists?
 * From the example below it goes to show that the number of comparisons is cut by half
 * As input increases, time taken to execute the algorithm increases at a slower rate compared to linear time complexity
 * The more data dropped after each pass, the faster the algorithm
 */

fun main() {
    /**
     * sort the list according to asc/ desc order
     * Since the list is sorted,values to the right half can only get bigger, i.e. first half is ignored
     */
    if (pseudoBinaryContains(451, listOf(1, 3, 56, 66, 68, 80, 99, 105, 450))) {
        println("match found")
    } else println("not found")
}

/**
 * checks half of the list to make a conclusion
 *If the middle is bigger than the desired value, the algorithm wont bother looking for values
 *on the right half of the list and vice versa
 * this example, log base 2 applies
 */
fun pseudoBinaryContains(value: Int, numbers: List<Int>): Boolean {
    if (numbers.isEmpty()) return false
    val middleIndex = numbers.size / 2
    if (value <= numbers[middleIndex]) {
        for (index in 0..middleIndex) {
            if (numbers[index] == value) {
                return true
            }
        }
    } else {
        for (index in middleIndex until numbers.size) {
            if (numbers[index] == value) {
                return true
            }
        }
    }
    return false
}