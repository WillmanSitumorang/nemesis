---
# 📄 **Pretest Kotlin & Basic Android Development (30 Soal)**
---

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

1. Apa tipe data untuk menyimpan teks di Kotlin?

   - a. `Char`
   - b. `Int`
   - c. `String`
   - d. `Double`
  Jawaban : C

2. Kata kunci `val` digunakan untuk:

   - a. Variabel global
   - b. Variabel tetap (tidak bisa diubah)
   - c. Variabel bisa diubah
   - d. Fungsi cetak
   Jawaban : C

3. Apa hasil dari `println(5 + 3 * 2)`?

   - a. 16
   - b. 11
   - c. 13
   - d. 6
   Jawaban : B

4. Fungsi utama program Kotlin adalah:

   - a. `start()`
   - b. `main()`
   - c. `run()`
   - d. `launch()`
   Jawaban : B

5. Di Android Studio, layout antarmuka ditulis dengan:

   - a. Kotlin
   - b. Java
   - c. XML
   - d. JSON
   Jawaban : C

6. Apa hasil dari kode berikut?

   ```kotlin
   val x = "4"
   println(x + 1)
   ```

   - a. 5
   - b. 41
   - c. Error
   - d. 14
   Jawaban : B

7. Fungsi `readLine()` dalam Kotlin digunakan untuk:

   - a. Menyimpan file
   - b. Menampilkan teks
   - c. Membaca input
   - d. Membuat variabel
   Jawaban : B

8. Apa hasil dari perbandingan berikut: `5 > 3 && 2 < 1`?

   - a. true
   - b. false
   - c. error
   - d. null
   Jawaban : B

9. Android Studio adalah tools untuk:

   - a. Menulis HTML
   - b. Menjalankan script Python
   - c. Membuat aplikasi Android
   - d. Desain presentasi
   Jawaban : C

10. Untuk berpindah dari satu activity ke activity lain di Android, digunakan:

- a. Intent
- b. Fragment
- c. TextView
- d. XML
Jawaban : A

---

### ✅ **Bagian B – Jawaban Penjelasan Singkat (15 Soal)**

11. Jelaskan perbedaan `val` dan `var` di Kotlin.
Jawaban : var adalah pendeskripsian variabel yang mutable (bisa diubah) sedangkan var bersifat immutable (tidak bisa diubah)
12. Sebutkan dua tipe data numerik dalam Kotlin.
Jawaban : Int dan Double
13. Apa kegunaan fungsi `println()`?
Jawaban : Fungsi `println()` digunakan untuk mencetak teks atau nilai ke konsol
14. Bagaimana cara mengambil input angka dari pengguna dan mengubahnya ke tipe `Int` secara aman?
Jawaban : Dengan menggunakan `readLine()?.toIntOrNull()` menambahkan ? untuk menghindari null interception
15. Sebutkan satu contoh layout yang sering digunakan dalam Android dan fungsinya.
Jawaban : Framelayout, digunakan untuk mengatur tata letak komponen UI secara fleksibel
16.  Apa itu `Intent` dalam Android?
Jawaban : `Intent` adalah objek yang digunakan untuk berpindah dari satu activity ke activity lain
1.  Bagaimana cara menampilkan teks di layar Android menggunakan Kotlin dan XML?
Jawaban : TextView
18.  Apa arti dari null safety dalam Kotlin?
Jawaban : Menambahkan ? pada variabel untuk menghindari null interception
19.  Apa perbedaan antara `toInt()` dan `toIntOrNull()`?
Jawaban : `toInt()` akan melemparkan error jika konversi gagal, sedangkan `toIntOrNull()` akan mengembalikan null.
20.  Sebutkan minimal satu keunggulan Kotlin dibandingkan Java dalam pengembangan Android.
Jawaban : Sintaks kotlin lebih mudah
21.  Dalam Android Studio, di folder mana biasanya file `activity_main.xml` disimpan?
Jawaban : File `activity_main.xml` biasanya disimpan di dalam folder `res/layout`.
22.  Bagaimana struktur dasar fungsi utama (`main`) dalam Kotlin? Tuliskan contohnya.
Jawaban : Struktur dasar fungsi utama dalam Kotlin adalah sebagai berikut:
```kotlin
fun main() {
    // kode program
}
```
23.  Apa yang dimaksud dengan `String interpolation` dalam Kotlin?
Jawaban : `String interpolation` adalah cara untuk menyisipkan nilai variabel ke dalam string dengan menggunakan tanda `$`. Contohnya `Hallo $nama`
24.  Apa arti `?.` dan `?:` dalam penulisan kode Kotlin?
Jawaban : `?.` adalah operator safe call yang digunakan untuk menghindari NullPointerException, sedangkan `?:` adalah operator elvis yang memberikan nilai default jika ekspresi sebelumnya bernilai null.
25.  Bagaimana Kotlin menangani error saat input dari user tidak sesuai tipe data?
Jawaban : toIntOrNull() akan mengembalikan null jika input tidak dapat dikonversi menjadi Int.

---

### ✅ **Bagian C – Perbaiki Kode (5 Soal)**

26. Perbaiki dan jelaskan:

```kotlin
fun main() {
    val umur = readLine()?.toIntOrNull()
    println("Umur anda adalah " + umur + 5)
}
```
Jawaban : Menghindari null interception
---

27. Perbaiki:

```kotlin
val nama = "Willman"
println("Halo $nama")
```
Jawaban : tidak perlu memakai String, berikan saja nilai variabelnya langsung 
---

28. Perbaiki dan jalankan:

```kotlin
fun main() {
    var nama = readLine()?.toString()
    var umur2 = readLine()?.toIntOrNull()
    println("Nama saya: $nama, umur: $umur2 tahun")
}
```
Jawaban : Menghindari null interception dengan menambahkan ? pada readLine()
---

29. Perbaiki kode berikut agar tidak error:

```kotlin
val angka = 20
val hasil = angka + 5
println(hasil)
```
Jawaban : untuk dapat menjumlahkan maka tipe data harus sama
---

30. Debug:

```kotlin
fun main() {
  val tinggi = readLine()?.toDoubleOrNull()
  println("Tinggi kamu adalah $tinggi")
}
```
Jawaban : Menghindari null interception
---
