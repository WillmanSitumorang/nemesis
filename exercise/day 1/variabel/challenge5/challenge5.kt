fun main(){
    print("Masukkan nilai (0-100): ")
    val nilai = readLine()?.toIntOrNull()

    if(nilai!=null && nilai in 0..100){
        val konversi = nilai / 25.0
        val hasilFormat = String.format("%.2f", konversi)
        println("Nilai $nilai -> skala 4.0 = $hasilFormat")
    }else{
        println("Input tidak valid")
    }
}