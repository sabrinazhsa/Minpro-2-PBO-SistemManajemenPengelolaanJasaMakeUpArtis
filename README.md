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

3. Lihat Pesanan (Read)

   Program menampilkan secara rinci seluruh daftar pesanan yang sudah dimasukkan oleh pengguna. Ketika tidak ada pesanan yang terdaftar maka akan muncul pesan sistem yang memberitahukan pengguna bahwa belum ada pesanan yang masuk. 

5. Tambah Pesanan (Create)

   Program meminta pengguna untuk memasukkan data pelanggan yang mencakup nama, alamat, serta nomor _handphone_ pelanggan. Kemudian pengguna memilih kategori layanan jasa make up yang tersedia. Program lalu membuat ID Pesanan dan total biaya secara otomatis berdasarkan pilihan kategori pengguna.

6. Hapus Pesanan (Delete)

   Program meminta pengguna memasukkan ID Pesanan yang ingin dihapus. Lalu program akan menghapus daftar pesanan sesuai dengan ID Pesanan yang dimasukkan oleh pengguna.

## Penjelasan penerapan encapsulation dan Inheritance
### 1. Encapsulation
Berikut merupakan penerapan encapsulation pada program ini:
<img width="722" height="348" alt="image" src="https://github.com/user-attachments/assets/9c709303-45ab-439c-b536-9535dd85d53e" />
Encapsulation atau enkapsulasi diterapkan di seluruh atribut pada class `Pelanggan`, `PemesananLayananMua`, `MakeUpWisuda`, dan `MakeUpPengantin`. Hal ini bertujuan agar dapat mencegah perubahan data secara langsung dari luar class yang berpotensi merusak konsistensi data. Sehingga akses atau perubahan terhadap atribut tersebut hanya bisa dilakukan dengan menggunakan method Getter dan Setter.

### 2. Inheritance
Berikut merupakan penerapan inheritance pada program ini:
<img width="566" height="37" alt="image" src="https://github.com/user-attachments/assets/c3d35b00-990b-4f5c-b6c7-e740ae5cc56d" />
<img width="592" height="30" alt="image" src="https://github.com/user-attachments/assets/d7c67ae6-dd77-4881-ac05-00b3dfac752f" />
Inheritance atau pewarisan diterapkan pada program ini agar menghindari duplikasi kode dengan cara mewariskan atribut dari kelas induk ke kelas anak. Class `PemesananLayananMUA` berperan sebagai Superclass atau kelas induk yang memiliki data umum seperti idPesanan, tanggalPelaksanaan, status, dan objek Pelanggan. Class `MakeUpWisuda` dan class `MakeUpPengantin berperan sebagai Subclass yang mewarisi atribut dari kelas induk dengan menggunakan kode `extends`. Sehingga setiap subclass tidak perlu menulis ulang atribut dari superclass. 

## Penjelasan letak penerapan nilai tambah
### 1. Penerapan Struktur MVC (Model, View, Controller)
Berikut merupakan struktur packages dari program ini:
<img width="397" height="310" alt="image" src="https://github.com/user-attachments/assets/ce7bb69d-aef4-45ec-8303-3bba59c290fd" />
Program ini memiliki 4 struktur packages dengan masing-masing fungsinya sendiri, antara lain:
### 2. Penerapan Polymorphism 
