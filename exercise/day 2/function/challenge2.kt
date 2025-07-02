fun main(){
    print("Masukkan nama: ")
    val name = readLine()?.toString()
    if(!name.isNullOrBlank()){
        greet(name)
    } else{
        println("Nama tidak boleh kosong")
    }
}

fun greet(name: String){
    println("Halo, $name!")
}

