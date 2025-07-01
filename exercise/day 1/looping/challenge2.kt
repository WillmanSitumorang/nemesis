fun main() {
    val secretNumber = 9
    var guestNumber : Int? = null
    var tebakan = 0

        while(secretNumber!= guestNumber){
            print("Masukkan angka tebakan: ")
            guestNumber = readLine()?.toIntOrNull()
            
            if(guestNumber!=null){
                tebakan = tebakan + 1
            }else{
                println("Input tidak valid")
            }
        }
    
    println("Tebakan Anda benar! Jumlah percobaan: $tebakan")

}