import kotlin.time.times

class Squares(naturalNumbersCount:Int) {
    private val range = 1..naturalNumbersCount
    private val sumOfRange = range.sum()
//    private val squaresOfRange = range.reduce { elem, _ -> elem * elem }

    fun sumOfSquares():Int {
        TODO("Implement the function to complete the task")
    }

    fun squareOfSum():Int {
        return sumOfRange.times(sumOfRange)
    }

    fun difference():Int {
        TODO("Implement the function to complete the task")
    }
}
