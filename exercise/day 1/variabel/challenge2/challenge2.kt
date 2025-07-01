fun main(){
    print("Masukkan tahun lahir: ")
    val tahunLahir = readLine()?.toIntOrNull()
    print("Masukkan tahun ini: ")
    val tahunIni = readLine()?.toIntOrNull()
    
    if (tahunLahir != null && tahunIni != null) {
        val usia = tahunIni - tahunLahir
        println("Tahun Lahir: $tahunLahir\nTahun sekarang: $tahunIni\nUsia Anda: $usia tahun")
    } else {
        println("Input tidak valid. Harap masukkan angka.")
    }

}