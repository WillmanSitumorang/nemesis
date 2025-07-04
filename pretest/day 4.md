```

## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

1. Fragment digunakan untuk: A. Menyimpan data permanen
   B. Menampilkan halaman web
   C. Membagi antarmuka aplikasi ke dalam bagian modular
   D. Menyimpan file gambar
   Jawaban: C

2. Kelas dasar untuk membuat fragment adalah: A. `AppCompatFragment`
   B. `FragmentManager`
   C. `Fragment`
   D. `SupportFragment`
   Jawaban: C

3. Metode untuk menambahkan fragment ke activity adalah: A. `addView()`
   B. `beginTransaction().add()`
   C. `inflate()`
   D. `pushFragment()`
   Jawaban: B

4. Untuk mengelola fragment, kita menggunakan: A. `ActivityManager`
   B. `FragmentAdapter`
   C. `FragmentManager`
   D. `Intent`
   Jawaban: C

5. Layout container yang umum digunakan untuk menempatkan fragment di XML adalah:
   A. `TextView`
   B. `LinearLayout`
   C. `FrameLayout`
   D. `ListView`
   Jawaban: C

```

---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. Fragment memiliki lifecycle yang sama persis dengan Activity.
   Jawaban: False
7. Satu activity bisa menampilkan lebih dari satu fragment.
   Jawaban: True
8. Kita tidak bisa mengganti fragment yang sedang ditampilkan.
   Jawaban: False
9.  Fragment bisa mengakses komponen UI dari activity langsung.
    Jawaban: True
10. Fragment tidak bisa hidup tanpa activity.
    Jawaban: True

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa fungsi `FragmentManager` dalam Android?
    Jawaban: Untuk mengelola fragment
12. Apa metode yang digunakan untuk menghubungkan layout XML ke fragment?
    Jawaban: `onCreateView()`
13. Sebutkan dua metode lifecycle penting pada fragment!
    Jawaban: `onCreate()`, `onViewCreated()`
14. Bagaimana cara mengirim data dari activity ke fragment?
    Jawaban: Menggunakan `setArguments(Bundle)` pada fragment
15. Mengapa kita menggunakan `FrameLayout` untuk fragment container?
    Jawaban: Karena `FrameLayout` memungkinkan penempatan satu fragment di atas yang lain, ideal untuk mengganti fragment.
16. Apa perbedaan antara `replace()` dan `add()` saat transaksi fragment?
    Jawaban: `replace()` mengganti fragment sedangkan `add()` menambahkan fragment baru tanpa menghapus yang lama.
17. Apakah fragment bisa berdiri sendiri tanpa activity? Jelaskan singkat.
    Jawaban: Tidak, karena fragment harus di triggers oleh activity dan tidak bisa hidup sendiri.
18. Bagaimana cara kembali ke fragment sebelumnya setelah `replace()`?
    Jawaban: Menggunakan `addToBackStack()` saat melakukan transaksi fragment.
19. Apa tujuan dari `setArguments(Bundle)` di fragment?
    Jawaban: Untuk mengirimkan data dari activity ke fragment
20. Sebutkan alasan menggunakan fragment dibanding activity!
    Jawaban: Fragment dapat digunakan berulang dan lebih fleksible dalam mengelola UI karena dapat menggunakan beberapa fragment dalam satu activity.

---

## 🛠️ **Bagian 4: Perbaikan Kode (10 Soal)**

21.

```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
```
Jawaban: Seharusnya `beginTransaction().add(...)` bukan `beginTransaction.add(...)`.

22.

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(...) { ... }
}
```
Jawaban: Seharusnya `class MyFragment : Fragment() { ... }`.

23.

```xml
<androidx.fragment.app.FragmentContainerView
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```
Jawaban: Seharusnya menggunakan `FragmentContainerView` untuk menampung fragment atau menggunakan `FrameLayout` sebagai container.

24.

```kotlin
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments = bundle
```
Jawaban: Seharusnya menggunakan `fragment.arguments = bundle` untuk mengatur argumen fragment.

25.

```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack()
    .commit()
```
Jawaban: Seharusnya `addToBackStack(null)` untuk menambahkan transaksi ke back stack setelah replace.

26.

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```
Jawaban: Seharusnya View?

27.

```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.arguments = args
```
Jawaban: Seharusnya `fragment.arguments = args` untuk mengatur argumen fragment.

28.

```kotlin
supportFragmentManager.pop()
```
Jawaban: Seharusnya `supportFragmentManager.popBackStack()` untuk kembali ke fragment sebelumnya.

29.

```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commit()
```
Jawaban: Seharusnya `commit()` bukan `commitNowAllowingStateLoss()` untuk menghindari kehilangan state yang tidak diinginkan.

30.

```kotlin
val view = inflater.inflate(R.layout.fragment_home)
```
Jawaban: Seharusnya `inflater.inflate(R.layout.fragment_home, container, false)` untuk menghubungkan layout dengan fragment.
---
