fun main(){
    print("Masukkan umur: ")
    val age = readLine()?.toIntOrNull()
    print("Apakah member (true/false): ")
    val member = readLine()?.toBoolean()
    println("Umur= $age \nMember: $member")
    if(age!=null){
        var status=""
        if(age>21 && member == true){
            status = "Boleh Masuk"
        }else{
            status = "Tidak Boleh Masuk"
        }
        println("Status: $status")
    } else{
        println("Input tidak valid")
    }

}