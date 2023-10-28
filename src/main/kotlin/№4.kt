fun main() {
    print("Введите элементы первого массива через запятую: ")
    val input1 = readLine()?.split(",")?.map { it.trim().toInt() } ?: emptyList()

    print("Введите элементы второго массива через запятую: ")
    val input2 = readLine()?.split(",")?.map { it.trim().toInt() } ?: emptyList()

    val result = findIntersectionWithCount(input1, input2)
    println("Пересечение массивов с учетом количества повторений: $result")
}

fun findIntersectionWithCount(array1: List<Int>, array2: List<Int>): List<Int> {
    val map1 = array1.groupingBy { it }.eachCount()
    val map2 = array2.groupingBy { it }.eachCount()

    val result = mutableListOf<Int>()

    for ((num, count1) in map1) {
        if (map2.containsKey(num)) {
            val count2 = map2[num] ?: 0
            val minCount = minOf(count1, count2)
            repeat(minCount) {
                result.add(num)
            }
        }
    }

    return result
}
