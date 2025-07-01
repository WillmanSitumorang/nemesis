fun main(){
    print("Masukkan total belanja: ")
    val total = readLine()?.toDoubleOrNull()
    println("Total Belanja: $total")
    if(total!=null){
        var diskon = 0.0
        if(total>100000){
            diskon = total * 0.1
        }
        var bayar = total - diskon
        println("Diskon: $diskon \nTotal bayar: $bayar")
    }else{
        println("Input tidak valid")
    }
}