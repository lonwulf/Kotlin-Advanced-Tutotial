package timeComplexities

fun main() {
    sumFromOneV1(4)//O(n) linear time
    sumFromOneV2(4)//O(n) linear time
    sumFromOneV3(4)//O(1) constant time
}

//version 1
fun sumFromOneV1(num: Int): Int {
    var result = 0
    for (i in 1..num) {
        println("$i")
        result += i
    }
    println(result)
    return result
}

//version 2
fun sumFromOneV2(num: Int): Int {
    return (1..num).reduce { sum, element -> sum + element }
}

//version 3
fun sumFromOneV3(num: Int): Int {
    return num * (num + 1) / 2
}

