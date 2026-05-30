# Praktikum PBO C1

Repository ini berisi kumpulan source code praktikum mata kuliah Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java. Project mencakup implementasi konsep dasar OOP, Java Collection Framework, GUI Java Swing, Lambda Expression, hingga koneksi database menggunakan JDBC dan MySQL.

---

# Teknologi yang Digunakan

* Java
* MySQL
* NetBeans IDE

---


# Deskripsi Pertemuan

## Pertemuan 1 — Dasar Java dan OOP

Mempelajari dasar bahasa Java, struktur program, class, object, atribut, method, constructor, serta proses compile dan run program Java.

## Pertemuan 2 — Encapsulation

Membahas penggunaan access modifier, setter dan getter, serta konsep encapsulation untuk menjaga keamanan data pada object.

## Pertemuan 3 — Inheritance

Mempelajari pewarisan class (inheritance), penggunaan keyword `extends`, dan method overriding.

## Pertemuan 4 — Polymorphism dan Abstract

Membahas polymorphism, abstract class, dan interface untuk membuat program lebih fleksibel dan reusable.

## Pertemuan 5 — Exception Handling

Mempelajari penanganan error menggunakan `try-catch`, `throw`, dan `throws`.

## Pertemuan 6 — Array dan ArrayList

Membahas struktur penyimpanan data menggunakan array dan `ArrayList`.

## Pertemuan 7 — Collection Framework

Mempelajari:

* List
* Set
* Map
* HashMap
* LinkedHashMap
* TreeMap

beserta perbedaan karakteristik masing-masing collection.

## Pertemuan 8 — GUI Java Swing

Membahas pembuatan tampilan GUI menggunakan:

* JFrame
* JButton
* JLabel
* JTextField
* JList

serta event handling pada Java Swing.

## Pertemuan 9 — GUI dan Event Handling

Mempelajari interaksi GUI menggunakan ActionListener, pengolahan input user, dan manipulasi data pada tampilan.

## Pertemuan 10 — Lambda Expression

Membahas:

* Functional Interface
* Lambda Expression
* Lambda Inline
* Lambda Block Statement
* Anonymous Class

untuk membuat kode Java lebih ringkas.

## Pertemuan 11 — JDBC dan MySQL

Mempelajari koneksi Java dengan database MySQL menggunakan JDBC serta implementasi operasi CRUD:

* Create
* Read
* Update
* Delete

## Pertemuan 12 — GUI CRUD Mahasiswa

Membahas integrasi Java Swing dengan database MySQL menggunakan arsitektur sederhana:

* Model
* Service
* GUI Program

Fitur yang dibuat:

* Tambah data mahasiswa
* Edit data mahasiswa
* Hapus data mahasiswa
* Ambil seluruh data
* Reset AUTO_INCREMENT database

---

# Cara Compile dan Run Program

## Compile Java Biasa

```powershell
javac NamaFile.java
java NamaFile
```

Contoh:

```powershell
javac DiskonLambda.java
java DiskonLambda
```

---

# Compile Project dengan Package

Karena project menggunakan package Java, compile dilakukan dengan:

```powershell
javac -d bin src/jdbc/program/*.java src/jdbc/model/*.java src/jdbc/service/*.java src/jdbc/utilities/*.java
```

Keterangan:

* `-d bin` → hasil compile masuk folder `bin`

---

# Menjalankan Program

```powershell
java -cp bin jdbc.program.JFrameUtama
```

Keterangan:

* `-cp bin` → mengambil class dari folder `bin`
* `jdbc.program.JFrameUtama` → nama package + nama class utama

---

# Jika Menggunakan JDBC MySQL Connector

Compile:

```powershell
javac -cp "lib/*" -d bin src/jdbc/program/*.java src/jdbc/model/*.java src/jdbc/service/*.java src/jdbc/utilities/*.java
```

Run:

```powershell
java -cp "bin;lib/*" jdbc.program.JFrameUtama
```

---

# Cara Menjalankan di NetBeans

1. Buka project di NetBeans
2. Pastikan MySQL aktif
3. Tambahkan JDBC Driver jika belum ada
4. Klik `Run Project`

---

# Tujuan Repository

Repository ini dibuat sebagai dokumentasi dan latihan praktikum mata kuliah Pemrograman Berorientasi Objek (PBO), sekaligus sebagai media pembelajaran implementasi Java dari dasar hingga database dan GUI.
