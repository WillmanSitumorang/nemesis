fun main(){
    print("Masukkan angka 1: ")
    val angka1 = readLine()?.toIntOrNull()
    print("Masukkan angka 2: ")
    val angka2 = readLine()?.toIntOrNull()
    print("Masukkan operator (+, -, *, /): ")
    val operator = readLine()?.toString()
    

    if(angka1!=null && angka2!=null){
        var hasil = 0
        when (operator){
            "+" -> hasil = angka1 + angka2
            "-" -> hasil = angka1 - angka2
            "*" -> hasil = angka1 * angka2
            "/" -> hasil = angka1 / angka2
            else -> "Input tidak valid"
        }
        println("Hasil: $hasil")
    }else{
        println("Input tidak valid")
    }
}