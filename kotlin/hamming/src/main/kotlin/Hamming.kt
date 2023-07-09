object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {

        if ( leftStrand.length != rightStrand.length ) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        }

        var distance = 0;
        leftStrand.forEachIndexed { i, c ->
            if (rightStrand[i] != c) {
                distance++
            }
        }

        return distance;
    }
}
