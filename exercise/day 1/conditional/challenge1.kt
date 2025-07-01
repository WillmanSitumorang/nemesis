fun main() {
    print("Masukkan nilai (0-100): ")
    val score = readLine()?.toIntOrNull()

    if (score != null && score in 0..100) {
        val mark = when {
            score >= 85 -> "A"
            score >= 70 -> "B"
            score >= 60 -> "C"
            score >= 50 -> "D"
            else -> "E"
        }

        println("Nilai $score mendapat $mark")
    } else {
        println("Input tidak valid")
    }
}