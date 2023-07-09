object ScrabbleScore {

    private val points: Map<String, Int> =
        mapOf(
            "A, E, I, O, U, L, N, R, S, T" to 1,
            "D, G" to 2,
            "B, C, M, P" to 3,
            "F, H, V, W, Y" to 4,
            "K" to 5,
            "J, X" to 8,
            "Q, Z" to 10
        )

    fun scoreLetter(c: Char): Int {
        return points
            .filterKeys { it.contains(c.toUpperCase()) }
            .toList()
            .first()
            .second
    }

    fun scoreWord(word: String): Int {
        var acc = 0;
        word.forEach { c -> acc += scoreLetter(c) }
        return acc
    }
}
