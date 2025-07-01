fun main(){
    print("Masukkan angka 1: ")
    val number1 = readLine()?.toIntOrNull()
    print("Masukkan angka 2: ")
    val number2 = readLine()?.toIntOrNull()
    println("Angka A: $number1 \nAngka B: $number2")
        if(number1!=null && number2!=null){
        var biggerNumber = 0
        if(number1 > number2){
            biggerNumber = number1
        }else{
            biggerNumber = number2
        }
        println("Angka lebih besar: $biggerNumber")
    } else{
        println("Input tidak valid")
    }
}