import kotlin.time.times

class Squares(naturalNumbersCount: Int) {
    private val range = 1..naturalNumbersCount
    private val sumOfRange = range.sum()
    private val squaresOfRange = range.reduce { acc, value -> acc + value * value }

    fun sumOfSquares(): Int {
        return squaresOfRange
    }

    fun squareOfSum(): Int {
        return sumOfRange.times(sumOfRange)
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}
