fun main() {
    print("Masukkan nama: ")
    val nama = readLine()?.toString()

    print("Apakah mahasiswa aktif? (true/false): ")
    val aktif = readLine()?.toBoolean()

    println("Nama: $nama \nMahasiswa Aktif: $aktif")
}