fun main(){
    print("Masukkan kalimat: ")
    val message = readLine()?.toString()
    print("Masukkan jumlah perulangan: ")
    val repeat = readLine()?.toIntOrNull()
    if(repeat!=null){
        for(i in 1..repeat){
            println(message)
    }

    }else{
        print("Input tidak valid")
    }
}