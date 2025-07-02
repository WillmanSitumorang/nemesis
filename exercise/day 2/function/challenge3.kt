fun main(){
    print("Masukkan nilai suhu (Celcius): ")
    val tempCelci = readLine()?.toIntOrNull()
    if(tempCelci!=null){
        val tempFarh = convertToFarenheit(tempCelci)
        println("Suhu $tempCelci dalam celcius adalah $tempFarh dalam Fahrenheit")
    }else{
        println("Input tidak valid")
    }
}

fun convertToFarenheit(celci: Int): Int{
    val tempFarh = celci*9/5+32
    return tempFarh
}