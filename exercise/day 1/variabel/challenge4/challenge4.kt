fun main(){
    print("Masukkan nama barang: ")
    val nama = readLine()?.toString()
    print("Masukkan jumlah barang: ")
    val jumlah = readLine()?.toIntOrNull()
    print("Masukkan harga barang: ")
    val harga = readLine()?.toDoubleOrNull()
    if(jumlah!=null && harga != null){
        val total = jumlah * harga
        println("Barang: $nama \nJumlah: $jumlah \nHarga Satuan: $harga \nTotal: $total")
    }else{
        println("Input tidak valid")
    }
}