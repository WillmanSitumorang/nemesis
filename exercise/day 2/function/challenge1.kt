fun main(){
    print("Masukkan panjang sisi: ")
    val side = readLine()?.toIntOrNull()
    if (side!=null){
        val area = areaSquare(side)
        print("Luas persegi adalah $area")
    }else{
        print("Input tidak valid")
    }
}

fun areaSquare(side:Int): Int{
    val area = side*side
    return area
}