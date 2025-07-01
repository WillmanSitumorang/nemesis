fun main(){
    println("1. Lihat menu \n2. Beli \n3. Keluar")
    while(true){
        print("\nMasukkan pilihan: ")
        val choice = readLine()?.toIntOrNull()
        if (choice != null && choice in 1..3){
            when(choice){
                1 -> print("Menu: \n1. Nasi Goreng \n2. Mie Ayam")
                2 -> print("Beli")
                else -> break
            }
        }else{
            print("Input tidak valid")
            continue
        }
    }
}