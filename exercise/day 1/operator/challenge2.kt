fun main(){
    print("Masukkan nomor kursi: ")
    val nomor = readLine()?.toIntOrNull()
    println("Nomor kursi: $nomor")
    if(nomor!=null){
        var status = ""
        if(nomor%2==0){
            status = "Genap"
        }else{
            status = "Ganjil"
        }
        println("Status: $status")
    }else{
        println("Input tidak valid")
    }
}