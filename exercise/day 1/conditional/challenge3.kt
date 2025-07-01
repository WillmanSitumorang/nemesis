fun main(){
    print("Masukkan username: ")
    val username = readLine()?.toString()
    print("Masukkan password: ")
    val password = readLine()?.toString()
    var notif = ""
    if(username == "admin" && password == "1234"){
        notif = "Login Berhasil"
    }else{
        notif = "Username atau password salah"
    }
    println(notif)

}