fun main(){
    var i  = 1
    var total = 0
    var avg = 0
    while(i<=5){
        print("Masukkan Nilai $i: ")
        val score = readLine()?.toIntOrNull()

        if(score!=null){
            total = total + score
            i++
        }else{
            println("Nilai tidak valid")
        }
    }
    if(total != 0){
        avg = total/5
    }else{
        avg = 0
    }
    println("Total: $total \nRata-rata: $avg")
    
}