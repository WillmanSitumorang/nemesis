fun main(){
    print("Masukkan umur: ")
    val age = readLine()?.toIntOrNull()
    print("Apakah member VIP (true/false): ")
    val member = readLine()?.toBoolean()
    println("Umur= $age \nMember: $member")
    if(age!=null){
        var status=""
        if(age>18 && member == true){
            status = "Diperbolehkan masuk"
        }else{
            status = "Tidak diperbolehkan masuk"
        }
        println("Status: $status")
    } else{
        println("Input tidak valid")
    }

}