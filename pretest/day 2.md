## 📄 **Pretest: Activity Lifecycle di Android (30 Soal)**

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

**Pilih satu jawaban yang paling benar.**

1. Method lifecycle manakah yang pertama kali dipanggil ketika Activity baru dimulai?
   a. `onResume()`
   b. `onCreate()`
   c. `onStart()`
   d. `onRestart()`
   Jawaban: B

2. Method `onPause()` biasanya dipanggil ketika...
   a. Aplikasi ditutup total
   b. User menekan tombol back
   c. Activity lain muncul di atas Activity saat ini
   d. Aplikasi di-_reinstall_
   Jawaban: C

3. Method `onDestroy()` akan selalu dipanggil jika...
   a. Aplikasi direstart
   b. Pengguna berpindah ke Activity lain
   c. Aplikasi ditutup melalui recent apps
   d. Tidak selalu dijamin dipanggil
   Jawaban: C

4. Saat rotasi layar terjadi, method apa yang umumnya **tidak** dipanggil kembali secara otomatis?
   a. `onCreate()`
   b. `onStart()`
   c. `onPause()`
   d. `onRestart()`
   Jawaban: D

5. Lifecycle `onRestart()` akan dipanggil saat...
   a. Aplikasi dijalankan pertama kali
   b. Setelah `onStop()` dan Activity dibuka lagi
   c. Setelah `onDestroy()`
   d. Setelah `onPause()`
   Jawaban: B


6. Saat user menekan tombol home, urutan method yang dipanggil adalah:
   a. `onPause()`, `onDestroy()`
   b. `onPause()`, `onStop()`
   c. `onStop()`, `onDestroy()`
   d. `onCreate()`, `onStart()`
   Jawaban: B

7. Untuk menyimpan data sementara sebelum Activity di-_recreate_, gunakan:
   a. `onStart()`
   b. `onPause()`
   c. `onSaveInstanceState()`
   d. `onResume()`
   Jawaban: C

8. Jika ingin mencegah Activity di-_recreate_ saat rotasi, properti apa yang ditambahkan?
   a. `android:stateAlwaysVisible`
   b. `android:keepScreenOn`
   c. `android:configChanges="orientation|screenSize"`
   d. `android:restartOnRotation`
   Jawaban: C

9. Lifecycle method mana yang dipanggil tepat setelah `onCreate()`?
   a. `onStop()`
   b. `onDestroy()`
   c. `onStart()`
   d. `onPause()`
   Jawaban: C

10. Fungsi dari `onResume()` adalah...
    a. Menyimpan data sebelum aplikasi ditutup
    b. Menjalankan logika utama setelah tampilan muncul
    c. Menghapus cache aplikasi
    d. Mendaftarkan listener ViewGroup
    Jawaban: B

---

### ❓ **Bagian B – True/False (10 Soal)**

**Tulis T (True) atau F (False) untuk setiap pernyataan.**

11. `onStart()` dipanggil hanya sekali selama siklus hidup Activity.
Jawaban: False
12. `onPause()` dipanggil sebelum `onStop()`.
Jawaban: True
13. `onDestroy()` selalu dipanggil jika Activity berpindah ke Activity lain.
Jawaban: False
14. Rotasi layar akan memanggil kembali `onCreate()`.
Jawaban: True
15. `onResume()` menandakan bahwa Activity sedang tampil dan aktif.
Jawaban: True
16. `onSaveInstanceState()` digunakan untuk menampilkan notifikasi.
Jawaban: False
17. Setelah `onStop()`, Activity akan langsung `onDestroy()` tanpa pengecualian.
Jawaban: False
18. Method `onRestart()` tidak akan pernah dipanggil jika aplikasi ditutup total.
Jawaban: True
19. `onCreate()` hanya digunakan untuk menampilkan layout.
Jawaban: False
20. Android menjamin bahwa semua lifecycle dipanggil secara berurutan.
Jawaban: False
---

### ✍️ **Bagian C – Isian Singkat (5 Soal)**

21. Sebutkan 3 method utama yang dipanggil ketika Activity pertama kali diluncurkan.
Jawaban: onCreate(), onStart(), onResume()
22. Apa fungsi utama dari method `onSaveInstanceState()`?
Jawaban: Menyimpan data sementara
23. Apa perbedaan `onPause()` dan `onStop()` dalam siklus Activity?
Jawaban: onPause() dipanggil ketika Activity tidak lagi terlihat tapi masih aktif, sedangkan onStop() dipanggil ketika Activity tidak lagi terlihat dan tidak dapat lagi berinteraksi.
24. Apa dampak dari tidak menambahkan `configChanges` saat orientasi berubah?
Jawaban: onCreate() akan dipanggil kembali
25. Sebutkan satu kondisi di mana `onDestroy()` **tidak** dipanggil oleh sistem Android.
Jawaban: Jika aplikasi ditutup melalui recent apps
---

### 🔧 **Bagian D – Koreksi Kode (5 Soal)**

**Perbaiki dan jelaskan kesalahan pada cuplikan kode berikut.**

26.

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)
}
```
Jawaban: onCreate() harus menerima parameter `savedInstanceState: Bundle?`.

27.

```kotlin
override fun onStop() {
  super.onStop()
  Log.d("LIFECYCLE", "Stopped")
}
```
Jawaban: `onStop()` tidak menerima parameter `savedInstanceState`.

28.

```kotlin
override fun onResume() {
   Log.d("LIFECYCLE", "Resumed")
  super.onResume()
}
```
Jawaban: `setContentView()` seharusnya dipanggil di `onCreate()`

29.

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  setContentView(R.layout.activity_main)
}
```
Jawaban: `Log.d()` seharusnya dipanggil di `onStart()` atau `onResume()`

30.

```kotlin
override fun onSaveInstanceState(outState: Bundle) {
  outState.putString("username", "admin")
  super.onSaveInstanceState(outState)
}
```   
Jawaban: `onSaveInstanceState()` harus menerima parameter `outState: Bundle` untuk menyimpan data.

---
