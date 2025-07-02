fun main() {
    print("Masukkan angka 1: ")
    val number1 = readLine()?.toIntOrNull()
    print("Masukkan angka 2: ")
    val number2 = readLine()?.toIntOrNull()
    print("Pilih operasi (+, -, *, /): ")
    val operator = readLine()?.trim()

    if (number1 != null && number2 != null) {
        val result = when (operator) {
            "+" -> add(number1, number2)
            "-" -> min(number1, number2)
            "*" -> multiply(number1, number2)
            "/" -> {
                if (number2 == 0) {
                    println("Tidak bisa membagi dengan nol!")
                    return
                } else divide(number1, number2)
            }
            else -> {
                println("Operator tidak valid")
                return
            }
        }
        println("Hasil: $result")
    } else {
        println("Input tidak valid")
    }
}

fun add(num1: Int, num2: Int): Double {
    return (num1 + num2).toDouble()
}

fun min(num1: Int, num2: Int): Double {
    return (num1 - num2).toDouble()
}

fun multiply(num1: Int, num2: Int): Double {
    return (num1 * num2).toDouble()
}

fun divide(num1: Int, num2: Int): Double {
    return num1.toDouble() / num2
}
