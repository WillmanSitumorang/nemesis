val dataNilai: MutableMap<String, MutableList<Int>> = mutableMapOf()

fun main(){
    while(true){
        println("\n=== MENU NILAI SISWA ===")
        println("1. Tambah Nilai Siswa \n2. Lihat Semua Data \n3. Cari Nilai Tertinggi \n4. Siswa yang Lulus \n5. Keluar")
        print("Pilih menu: ")
        val choice = readLine()?.toIntOrNull()
        if(choice!=null){
            when(choice){
                1 -> add()
                2 -> show()
                3 -> highestScore()
                4 -> pass()
                else -> break
            }
        }else{
            println("Input tidak valid")
            continue
        }
    }
}

fun add(){
    while(true){
        print("Masukkan Nama Siswa (atau ketik 'x' untuk kembali): ")
        val nama = readLine()?.trim()
        if (nama.equals("x", ignoreCase = true)) break
        if (!nama.isNullOrBlank()) {
            print("Masukkan nilai: ")
            val nilai = readLine()?.toIntOrNull()
            if (nilai != null && nilai in 0..100) {
                dataNilai.getOrPut(nama) { mutableListOf() }.add(nilai)
                println("Nilai berhasil ditambahkan untuk $nama.")
                break
            } else {
                println("Nilai tidak valid (harus 0-100).")
                continue
            }
        } else {
            println("Nama tidak boleh kosong.")
            continue
        }
    }
}

fun show(){
    println("\n=== Semua Data Nilai ===")
    if (dataNilai.isEmpty()) {
        println("Belum ada data.")
    } else {
        for ((nama, nilaiList) in dataNilai) {
            val rata = if (nilaiList.isNotEmpty()) nilaiList.average() else 0.0
            println("Nama: $nama")
            println("Nilai: ${nilaiList.joinToString(", ")}")
            println("Rata-rata: ${"%.2f".format(rata)}")
            println()
        }
    }
}

fun highestScore() {
    println("\n=== Nilai Tertinggi ===")
    var maxNilai = -1
    val siswaTertinggi = mutableListOf<String>()

    for ((nama, nilaiList) in dataNilai) {
        val tertinggi = nilaiList.maxOrNull() ?: continue
        if (tertinggi > maxNilai) {
            maxNilai = tertinggi
            siswaTertinggi.clear()
            siswaTertinggi.add(nama)
        } else if (tertinggi == maxNilai) {
            siswaTertinggi.add(nama)
        }
    }

    if (siswaTertinggi.isNotEmpty()) {
        println("Nilai tertinggi adalah $maxNilai, diraih oleh:")
        for (nama in siswaTertinggi) {
            println("- $nama")
        }
    } else {
        println("Belum ada data nilai.")
    }
}


fun pass(){
    println("\n=== Siswa yang Lulus (rata-rata ≥ 75) ===")
    val lulus = dataNilai.filter { (_, nilaiList) ->
        nilaiList.isNotEmpty() && nilaiList.average() >= 75
    }
    if (lulus.isEmpty()) {
        println("Tidak ada siswa yang lulus.")
    } else {
        lulus.forEach { (nama, nilaiList) ->
            println("$nama dengan Rata-rata: ${"%.2f".format(nilaiList.average())}")
        }
    }
}