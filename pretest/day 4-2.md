
```
#### 1. Library paling umum digunakan untuk HTTP Client di Android Kotlin modern:

a. OkHttp
b. Volley
c. Retrofit
d. Alamofire
Jawaban: c. Retrofit

---

#### 2. Fungsi dari `@GET("users")` dalam Retrofit:

a. Menyimpan data pengguna
b. Mengirim form ke server
c. Mengirim permintaan HTTP GET ke endpoint `users`
d. Menghapus pengguna dari server
Jawaban: c. Mengirim permintaan HTTP GET ke endpoint `users`

---

#### 3. Mengapa kita menggunakan Coroutine atau `Call.enqueue()` saat Retrofit dipakai?

a. Untuk mempermudah syntax Kotlin
b. Untuk menjaga agar UI tidak macet saat HTTP call
c. Agar data disimpan ke SharedPreferences
d. Agar aplikasi bisa offline
Jawaban: b. Untuk menjaga agar UI tidak macet saat HTTP call

---

#### 4. Untuk mengkonversi JSON ke objek Kotlin, kita menggunakan:

a. JsonParser
b. GsonConverterFactory
c. JSONTokener
d. JSONBuilder
Jawaban: b. GsonConverterFactory

---

#### 5. Fungsi utama `baseUrl` di Retrofit:

a. Mengatur authentication
b. Menentukan response type
c. Menentukan endpoint utama API
d. Menentukan ukuran file
Jawaban: c. Menentukan endpoint utama API

---

#### 6. Kapan kita perlu menambahkan `@Query` di Retrofit?

a. Saat upload file
b. Saat mengirim body JSON
c. Saat menambahkan parameter URL
d. Saat menyimpan token
Jawaban: c. Saat menambahkan parameter URL

---

#### 7. `Response.body()` akan bernilai `null` jika:

a. API berhasil dipanggil
b. Status HTTP adalah 200
c. Response tidak sesuai format
d. Retrofit tidak digunakan
Jawaban: c. Response tidak sesuai format

---

#### 8. Untuk membuat POST request dengan Retrofit, anotasi yang digunakan adalah:

a. @GET
b. @POST
c. @PUT
d. @FETCH
Jawaban: b. @POST

---

#### 9. Apa yang terjadi jika kita lupa menambahkan `.create()` pada GsonConverterFactory?

a. Program tetap jalan
b. Data akan disimpan sebagai string
c. Retrofit akan error saat parsing
d. File JSON akan corrupt
Jawaban: c. Retrofit akan error saat parsing

---

#### 10. Manakah dari berikut ini yang merupakan cara **asynchronous** memanggil API dengan Retrofit?

a. `.execute()`
b. `.enqueue()`
c. `.get()`
d. `.await()`
Jawaban: b. `.enqueue()`

---
```

#### 11. Jelaskan perbedaan antara Retrofit dan OkHttp dalam arsitektur Android.
Jawaban: Retrofit adalah library yang dibangun di atas OkHttp untuk menyediakan anotasi untuk endpoint dan otomatis mengkonversi JSON ke objek Kotlin. OkHttp adalah HTTP client yang menangani koneksi, caching, dan request/response secara low-level.
---

#### 12. Sebutkan dua cara menangani response API di Retrofit!
Jawaban: Menggunakan Callback (Asynchronous) dan menggunakan Coroutine (Suspend Function)
---

#### 13. Bagaimana cara mengecek apakah response dari server berhasil atau tidak?
Jawaban: Jika status code adalah 200, maka response dianggap berhasil.

#### 14. Apa fungsi `@Header("Authorization")` dalam Retrofit?
Jawaban: Untuk menambahkan header Authorization pada setiap permintaan API
---

#### 15. Apa itu suspend function dan mengapa sering digunakan bersama Retrofit?
Jawaban: Suspend function adalah fungsi yang dapat ditangguhkan dan dilanjutkan kembali tanpa memblokir thread. Ini sering digunakan bersama Retrofit untuk membuat panggilan API secara asynchronous dan lebih mudah dibaca dengan menggunakan coroutine.
---

#### 16. Sebutkan satu contoh kasus nyata di mana HTTP client dibutuhkan dalam aplikasi Android.
Jawaban: Mengambil data pengguna dari server untuk ditampilkan di aplikasi, seperti daftar produk.
---

#### 17. Jika API kamu lambat dan pengguna harus menunggu lama, bagaimana solusi teknisnya?
Jawaban: Mengimplementasikan caching di sisi klien atau menggunakan pagination untuk mengurangi jumlah data yang diambil sekaligus.

---

#### 18. Bagaimana cara menangani `TimeoutException` saat HTTP call?
Jawaban: Menggunakan mekanisme retry atau menampilkan pesan kesalahan kepada pengguna jika waktu tunggu habis.

---

#### 19. Mengapa penting untuk menangani error code seperti 401 atau 500?
Jawaban: Agar aplikasi dapat memberikan umpan balik yang tepat kepada pengguna dan mengambil tindakan yang sesuai, seperti meminta login ulang untuk 401 atau menampilkan pesan kesalahan untuk 500.

---

#### 20. Apa itu DTO dalam konteks komunikasi dengan API?
Jawaban: DTO (Data Transfer Object) adalah objek yang digunakan untuk mengirim data antara aplikasi dan API, biasanya berisi hanya data yang diperlukan untuk operasi tertentu, sehingga mengurangi overhead dan meningkatkan performa.
---

### 🛠️ ** FIX CODE **

#### 21. Perbaiki kode Retrofit interface ini agar valid:

```kotlin
interface ApiService {
    @GET("users/{id}")
    fun getUser(): Call<User>
}
```
Jawaban: Get membutuhkan parameter misalnya "users/{id}"

```kotlin
---

#### 22. Ada kesalahan dalam Retrofit builder berikut. Apa yang salah?

```kotlin
val retrofit = Retrofit.Builder()
    .baseUrl("https://api.example.com")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
```
Jawaban: GsonConverterFactory seharusnya dipanggil dengan .create(), karena addConverterFactory() membutuhkan sebuah instance, bukan class reference.
---

#### 23. Diberikan JSON seperti ini:

```json
{
  "status": "ok",
  "data": {
    "id": 10,
    "name": "Anna"
  }
}
```

Perbaiki model Kotlin-nya:

```kotlin
data class User(
    val id: Int,
    val name: String
)
```
Jawaban: Harusnya memakai `name`
---

#### 24. Lengkapi kode Retrofit untuk mengirim data JSON:

```kotlin
@POST("user/add")
fun createUser(@Body user: User): Call<User>
```
Jawaban: Tambahkan tipe data user
---

#### 25. Perbaiki fungsi berikut agar memanggil API secara asynchronous:

```kotlin
val call = apiService.getUser()
call.enqueue(object : Callback<User> {
    override fun onResponse(call: Call<User>, response: Response<User>) {
        if (response.isSuccessful) {
            val user = response.body()
            // TODO: Gunakan data user di sini
            println("User: $user")
        } else {
            println("Error: ${response.code()} - ${response.message()}")
        }
    }

    override fun onFailure(call: Call<User>, t: Throwable) {
        println("Network error: ${t.message}")
    }
})
```
Jawaban: Untuk memanggil API secara asynchronous menggunakan Retrofit harus mengganti execute() dengan enqueue() dan memberikan callback.
---

#### 26. Perbaiki parameter Retrofit berikut agar bisa mengirim `id` lewat query:

```kotlin
@GET("user/{id}")
fun getUser(@Param("id") id: Int): Call<User>
```
Jawaban: dengan menambahkan `{id}`
---

#### 27. Perbaiki kode berikut agar response-nya bisa langsung digunakan di ViewModel coroutine:

```kotlin
@GET("user")
suspend fun getUser(): User
```
Jawaban: Menambahkan `suspend`
---

#### 28. Lengkapi kode penggunaan Retrofit di Android ViewModel:

```kotlin
val user = api.getUser()
user.enqueue(object : Callback<User> {
    override fun onResponse(call: Call<User>, response: Response<User>) {
        if (response.isSuccessful) {
            val userData = response.body()
            // handle success
        } else {
            // handle error response (e.g., 4xx/5xx)
        }
    }

    override fun onFailure(call: Call<User>, t: Throwable) {
        // handle network failure or unexpected error
    }
})
```
---

#### 29. Lengkapi `DataRepository` berikut agar bisa meng-handle error response:

```kotlin
val call = api.getUser()
call.enqueue(object : Callback<User> {
    override fun onFailure(call: Call<User>, t: Throwable) {
        // Tangani error jaringan, timeout, atau kesalahan tak terduga lainnya
        Log.e("DataRepository", "Network error: ${t.message}")
    }

    override fun onResponse(call: Call<User>, response: Response<User>) {
        if (response.isSuccessful) {
            val user = response.body()
            if (user != null) {
                // Handle data berhasil diterima
                Log.d("DataRepository", "User received: $user")
            } else {
                // Response sukses tapi body null
                Log.w("DataRepository", "Response body is null")
            }
        } else {
            // Tangani error dari server (HTTP 4xx / 5xx)
            val errorBody = response.errorBody()?.string()
            Log.e("DataRepository", "API error ${response.code()}: $errorBody")
        }
    }
})
```

---

#### 30. Perbaiki kode pemanggilan API ini agar menggunakan `suspend` function dan `try-catch`:

```kotlin
suspend fun fetchUser(): User? {
    return try {
        val response = api.getUser() // suspend function
        if (response.isSuccessful) {
            response.body()
        } else {
            // Optional: log or throw error based on response code
            Log.e("API", "Error: ${response.code()} - ${response.message()}")
            null
        }
    } catch (e: Exception) {
        Log.e("API", "Exception: ${e.message}")
        null
    }
}
```
Jawaban: Menggunakan `suspend`
---
