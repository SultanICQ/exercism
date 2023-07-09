import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(of: LocalDateTime) {
    val date: LocalDateTime

    init {
        date = of.plusSeconds(1_000_000_000)
    }

    constructor(of: LocalDate) : this(of.atStartOfDay())
}
