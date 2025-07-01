fun main() {
    print("Masukkan umur: ")
    val age = readLine()?.toIntOrNull()

    if (age != null) {
        val cathegory = when {
            age >= 60 -> "Lansia"
            age >= 20 -> "Dewasa"
            age >= 13 -> "Remaja"
            else -> "Anak-anak"
        }
        println("Umur $age termasuk kategori $cathegory")
        } else {
        println("Input tidak valid")
    }
}