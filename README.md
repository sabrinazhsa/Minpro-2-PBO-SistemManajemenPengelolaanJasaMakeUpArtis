# Minpro-2-PBO-SistemManajemenPengelolaanJasaMakeUp


## Deskripsi Program
Program ini bertema Sistem Manajemen Pengelolaan Jasa Make Up Artis (MUA) yang menerapkan fitur CRUD atau Create, Read, Update, Delete. Program berbasis _command line_ ini dirancang untuk mensimulasikan sebuah sistem pemesanan jasa make up yang dapat membantu penyedia jasa MUA dalam mencatat pesanan, mengelola data pelanggan, serta menghitung total biaya pengerjaan secara otomatis. Program ini memiliki dua kategori layanan jasa make up, yaitu Make Up Wisuda dan Make Up Pengantin. Setiap kategori layanan memiliki cara perhitungan biaya yang berbeda. Adapun fitur yang tersedia pada program ini adalah sebagai berikut:
| Fitur |	Keterangan |
| ------------------------- | ------------ |
| Lihat Semua Pemesanan |	Menampilkan seluruh data pesanan yang tercatat |
| Tambah Pemesanan	| Mencatat pesanan baru (Wisuda atau Pengantin) beserta data pelanggannya |
| Update Pemesanan	| Mengubah status pembayaran dan total harga pesanan yang sudah ada |
| Hapus Pemesanan	| Menghapus data pesanan berdasarkan ID |

## Penjelasan Alur Program
Adapun alur dari program ini adalah sebagai berikut:
1. Inisialisasi Program (Main)

   Program dijalankan melalui class `JasaMakeUpArtis` untuk menampilkan menu utama secara _looping_ selama pengguna tidak menginput pilihan keluar dari program.
   Berikut merupakan tampilan menu utama pada program.
   
   <img height="200" alt="image" src="https://github.com/user-attachments/assets/f9460af8-c2eb-4f13-9839-fde253b357ea" />

2. Lihat Pesanan (Read)

   Program menampilkan secara rinci seluruh daftar pesanan yang sudah dimasukkan oleh pengguna. Ketika tidak ada pesanan yang terdaftar maka akan muncul pesan sistem yang memberitahukan pengguna bahwa belum ada pesanan yang masuk.
   Berikut merupakan tampilan ketika pengguna menginput angka '1'.
   
   <img height="300" alt="image" src="https://github.com/user-attachments/assets/e964ab4d-c34c-4fe7-b128-84cd46386d7c" />

3. Tambah Pesanan (Create)

   Program meminta pengguna untuk memasukkan data pelanggan yang mencakup nama, alamat, serta nomor _handphone_ pelanggan. Kemudian pengguna memilih kategori layanan jasa make up yang tersedia. Program lalu membuat ID Pesanan dan total biaya secara otomatis berdasarkan pilihan kategori pengguna.
   Berikut merupakan tampilan ketika pengguna menginput angka '2'.

   <img height="300" alt="image" src="https://github.com/user-attachments/assets/c06ddbc7-0598-4f26-8f85-e09fb2e8aebf" />

   Setelah pengguna memasukkan seluruh permintaan sistem, maka ketika mengecek kembali data pemesanan akan muncul tampilan seperti gambar di bawah ini:
   
   <img height="300" alt="image" src="https://github.com/user-attachments/assets/7521e2a4-7327-49d0-b26c-d17083ab0d3a" />


4. Ubah Pesanan (Update)
   Program meminta pengguna untuk memasukkan ID Pesanan yang ingin diubah. Jika ID tidak ditemukan, sistem akan terus meminta input ID yang valid. Menu ini untuk mengubah status pesanan dan melakukan penyesuaian harga.
   Berikut merupakan tampilan ketika pengguna menginput angka '3'.
   
   <img height="300" alt="image" src="https://github.com/user-attachments/assets/1391f1c2-4d26-44cb-af04-3016f1ba96ff" />

   Setelah itu, perubahan data pesanan dapat dilihat pada gambar di bawah ini.

   <img height="250" alt="image" src="https://github.com/user-attachments/assets/02866fe4-d895-4fb5-ad15-9294e42eb7e0" />


6. Hapus Pesanan (Delete)

   Program meminta pengguna memasukkan ID Pesanan yang ingin dihapus. Lalu program akan menghapus daftar pesanan sesuai dengan ID Pesanan yang dimasukkan oleh pengguna.
   Berikut merupakan tampilan ketika pengguna menginput angka '4'.

   <img height="250" alt="image" src="https://github.com/user-attachments/assets/b57532c8-c8c7-47fc-81ef-933dacba75a2" />

   Setelah itu, pesanan dengan ID Pesanan yang telah dimasukkan oleh pengguna dapat dilihat pada gambar di bawah telah terhapus.

   <img height="300" alt="image" src="https://github.com/user-attachments/assets/be59276c-8e05-4b47-9764-4f23dea614d3" />

## Penjelasan penerapan encapsulation dan Inheritance
### 1. Encapsulation
Berikut merupakan penerapan encapsulation pada program ini:

<img height="250" alt="image" src="https://github.com/user-attachments/assets/9c709303-45ab-439c-b536-9535dd85d53e" />

Encapsulation atau enkapsulasi diterapkan di seluruh atribut pada class `Pelanggan`, `PemesananLayananMua`, `MakeUpWisuda`, dan `MakeUpPengantin`. Hal ini bertujuan agar dapat mencegah perubahan data secara langsung dari luar class yang berpotensi merusak konsistensi data. Sehingga akses atau perubahan terhadap atribut tersebut hanya bisa dilakukan dengan menggunakan method Getter dan Setter.

### 2. Inheritance
Berikut merupakan penerapan inheritance pada program ini:

<img height="50" alt="image" src="https://github.com/user-attachments/assets/c3d35b00-990b-4f5c-b6c7-e740ae5cc56d" />

<img height="50" alt="image" src="https://github.com/user-attachments/assets/d7c67ae6-dd77-4881-ac05-00b3dfac752f" />

Inheritance atau pewarisan diterapkan pada program ini agar menghindari duplikasi kode dengan cara mewariskan atribut dari kelas induk ke kelas anak. Class `PemesananLayananMUA` berperan sebagai Superclass atau kelas induk yang memiliki data umum seperti idPesanan, tanggalPelaksanaan, status, dan objek Pelanggan. Class `MakeUpWisuda` dan class `MakeUpPengantin berperan sebagai Subclass yang mewarisi atribut dari kelas induk dengan menggunakan kode `extends`. Sehingga setiap subclass tidak perlu menulis ulang atribut dari superclass. 

## Penjelasan letak penerapan nilai tambah
### 1. Penerapan Struktur MVC (Model, View, Controller)
Berikut merupakan struktur packages dari program ini:

<img height="250" alt="image" src="https://github.com/user-attachments/assets/ce7bb69d-aef4-45ec-8303-3bba59c290fd" />

Alasan penerapan struktur MVC ini adalah untuk memisahkan setiap bagian kode program agar lebih rapi. Program ini memiliki 4 struktur packages dengan masing-masing fungsinya sendiri, fungsi tersebut antara lain:

a. Model

Memiliki fungsi untuk menyimpan data dari masing-masing class tanpa mencampuri tampilan program.

b. View

Memiliki fungsi untuk menampilkan menu ke layar dan membaca input dari pengguna. Contohnya seperti Class `TampilkanLayananMUA` berperan sebagai jembatan yang memanggil class `LayananValidator` untuk memvalidasi input, lalu meneruskan hasilnya ke class `LayananCRUD` untuk diproses.

c. Controller

Memiliki fungsi yang berfungsi menyimpan logika program agar terpisah dari tampilan maupun struktur data. Class yang masuk dalam packages ini yaitu class `LayananValidator`.
### 2. Penerapan Polymorphism 
Berikut merupakan penerapan polymorphism pada subclass `MakeUpWisuda` dan `MakeUpPengantin`:

<img height="250" alt="image" src="https://github.com/user-attachments/assets/ff1655e5-07cc-4617-9439-cd7b8f7e3bb5" />

<img height="250" alt="image" src="https://github.com/user-attachments/assets/2285be80-ef04-41eb-bb08-39bfebbad770" />

Polymorphism diterapkan dalam program ini melalui method Overriding pada `hitungTotalBiaya()` dan `tampilkanDetailPesanan` yang dimiliki oleh class `PemesananLayananMUA`. Hal ini dilakukan untuk menyimpan seluruh pesanan yang memungkinkan suatu method di kelas induk untuk memiliki implementasi yang berbeda pada masing-masing kelas anak.
