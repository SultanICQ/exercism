class Matrix(private val matrixAsString: String) {
    private val _matrix: List<List<Int>> = matrixAsString
        .split("\n")
        .map { s -> s.split(" ").map { it.toInt() } }
        .toList()

    fun column(colNr: Int): List<Int> {
        return _matrix.map { i -> i[colNr.dec()] }
            .toList()
    }

    fun row(rowNr: Int): List<Int> {
        return _matrix[rowNr.dec()]
    }
}
