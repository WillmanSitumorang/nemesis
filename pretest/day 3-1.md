## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

```
1. Komponen Android yang digunakan untuk menampilkan teks adalah:
   A. Button
   B. EditText
   C. TextView
   D. ImageView
   Jawaban: C

2. Komponen UI yang digunakan untuk mengambil input teks dari pengguna adalah:
   A. Button
   B. TextView
   C. EditText
   D. Spinner
   Jawaban: C

3. Untuk menampilkan gambar, kita menggunakan komponen:
   A. WebView
   B. ImageView
   C. RecyclerView
   D. VideoView
   Jawaban: B

4. Layout yang memungkinkan penempatan elemen secara bebas dengan constraint disebut:
   A. LinearLayout
   B. RelativeLayout
   C. ConstraintLayout
   D. FrameLayout
   Jawaban: C

5. Manakah yang merupakan komponen UI untuk menampilkan daftar data besar secara efisien?
   A. ListView
   B. GridView
   C. RecyclerView
   D. TextView
   Jawaban: C

```
---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. `LinearLayout` hanya bisa digunakan untuk tata letak horizontal.
   Jawaban: False
7. `Button` bisa digunakan untuk menampilkan gambar.
    Jawaban: True
8. `ScrollView` hanya dapat memiliki satu child langsung.
   Jawaban: True
9.  `Toast` digunakan untuk menampilkan notifikasi yang butuh interaksi pengguna.
    Jawaban: False
10. `findViewById()` digunakan untuk mengambil referensi UI dari layout XML.
    Jawaban: True

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa nama layout yang cocok untuk membuat UI kompleks dengan aturan posisi antar elemen?
    Jawaban: ConstraintLayout
12. Sebutkan dua komponen UI untuk input pilihan pengguna!
    Jawaban: RadioButton, CheckBox
13. Fungsi dari `TextInputLayout` adalah untuk...?
    Jawaban: Menambahkan label dan hint pada `EditText`
14. Bagaimana cara menambahkan teks ke `TextView` di Kotlin?
    Jawaban: textView.text = "Teks Baru"
15. Apa fungsi `RecyclerView.Adapter` dalam RecyclerView?
    Jawaban: Menghubungkan data dengan tampilan item di RecyclerView
16. Apa perbedaan utama antara `TextView` dan `EditText`?
    Jawaban: `TextView` untuk mensmpilksn teks, sedangkan `EditText` untuk input dari user.
17. Komponen apa yang digunakan untuk membuat notifikasi pop-up singkat di layar?
    Jawaban: Toast
18. Sebutkan satu perbedaan antara `LinearLayout` dan `RelativeLayout`!
    Jawaban: `LinearLayout` mengatur elemen secara vertikal atau horizontal, sedangkan `RelativeLayout` mengatur elemen relatif terhadap elemen lain.
19. Apa nama komponen UI untuk menampilkan teks dengan opsi "hint"?
    Jawaban: `TextInputLayout`
20. Jika ingin menambahkan ikon di atas tombol, komponen apa yang sebaiknya digunakan?
    Jawaban: `ImageView`

---

## 🛠️ **Bagian 4: Perbaiki Kode (10 Soal)**

21.

```xml
<TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Hello" />
```
Jawaban: seharusnya menggunakan match_parent


22.

```kotlin
val btn = findViewById<Button>(R.id.button)
btn.setText("Click Me")
```
Jawaban: seharusnya menggunakan setText

23.

```xml
<LinearLayout
    android:orientation="vertical"
    ...>
```
Jawaban: seharusnya menggunakan "vertical"

24.

```kotlin
val text = findViewById<TextView>(R.id.textView)
text.text = "Hi"
```
Jawaban: seharusnya menggunakan text

25.

```xml
<ImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:src="image.png" />
```
Jawaban: seharusnya menggunakan @drawable/image.png

26.

```kotlin
val input = findViewById<EditText>(R.id.input)
val value = input.text().toString
```
Jawaban: seharusnya menggunakan input.text.toString()

27.

```xml
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:onClick="doSomething" />
```
Jawaban: tidak perlu ada tanda kurung

28.

```kotlin
Toast.makeText(this, "Saved!", Toast.LENGTH_LONG).show()
```
Jawaban: seharusnya menggunakan Toast.LENGTH_LONG

29.

```xml
<EditText
    android:hint="Enter name"
    ... />
```
Jawaban: seharusnya bukan hintText, tapi hint

30.

```kotlin
val layout = LinearLayout(this)
layout.orientation = LinearLayout.VERTICAL
setContentView(layout)
```
---
Jawaban: seharusnya menggunakan setContentView
