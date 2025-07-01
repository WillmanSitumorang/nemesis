fun main(){
    print("Masukkan nama: ")
    val nama = readLine()?.toString()
    print("Masukkan umur: ")
    val umur = readLine()?.toIntOrNull()
    print("Masukkan kota: ")
    val kota = readLine()?.toString()
    println("Nama: $nama \nUmur: $umur tahun \nKota: $kota")
}