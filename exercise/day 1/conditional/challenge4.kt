fun main(){
    println("1. Nasi Goreng \n2. Mie Ayam \n3. Ayam Geprek")
    print("Masukkan pilihan: ")
    val choice = readLine()?.toIntOrNull()
    println("Pilihan: $choice")
    if(choice!=null && choice in 1..3){
        val name = when(choice){
        1 -> "Nasi Goreng"
        2 -> "Nasi Goreng"
        3 -> "Nasi Goreng"
        else-> "Input tidak Valid"
    }
    println("Kamu memilih: $name")

    }else{
        println("Input tidak Valid")
    }
}