fun main() {
    val matrix = arrayOf(
        intArrayOf(5, 9, 6, 7, 2),
        intArrayOf(9, 8, 4, 5, 3),
        intArrayOf(6, 4, 3, 8, 7),
        intArrayOf(7, 5, 8, 4, 8),
        intArrayOf(2, 3, 7, 8, 1)
    )

    if (isSymmetric(matrix)) {
        println("Массив симметричен относительно главной диагонали.")
    } else {
        println("Массив не симметричен относительно главной диагонали.")
    }
}

fun isSymmetric(matrix: Array<IntArray>): Boolean {
    val rows = matrix.size
    val cols = matrix[0].size

    if (rows != cols) {
        return false
    }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            if (matrix[i][j] != matrix[j][i]) {
                return false
            }
        }
    }

    return true
}