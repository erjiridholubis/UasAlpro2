# UasAlpro2
Project Akhir Alpro 2

Anggota : 

- Megi Fitryanto     
- Nur Muhammad Erji Ridho Lubis
- Amailia

Permasalahannya :

Pemilik warung mencatat semua orang yang menghutang dalam buku dan ketika ingin melihat nama orang yang jumlah hutaangnya banyak atau ketika ada orang yang ingin membayar hutangnya harus dilihat satu-satu perlembar pada catatan buku pemilik warung dan hal tersebut memakan waktu yang lama.

Solusi :

    1. Pemilik warung akan lebih mudah dalam mengecek data seperti urutan nama orang yang menghutang dari jumlah terbanyak hingga sedikit
    2. Pemilik warung lebih mudah melihat tempo pembayaran yang paling dekat hingga yang masih lama.
    3. Pemilik warung lebih efisien dalam mencari data orang yang menghutang, jika penghutang ingin melunasi hutangnya.


Objek :

- Invoice
- Pelanggan 
- Metode Pembayaran  
- Barang


Variable :

 - Invoice  
  
    - invoice
    - id barang (multi)
    - id pelanggan
    - id metode
    - tempo
    - total
    - status

- Pelanggan
  
    - id
    - nama_pelanggan
    - alamat_pelanggan
    - no_hp

- Barang
  
    - id
    - nama_barang
    - harga
    - stok

- Metode
  
    - id
    - nama_metode
    - rekening


Algoritma :

    1. Deklarasikan object barang, metode, pelanggan, dan invoice
    2. Didalam tiap object dideklarasikan variable untuk tiap object berdasarkan deskripsi di atas
    3. kemudian deklarasikan method main untuk menampilkan menu crud data tiap object
    4. didalam object barang, dapat melakukan input data barang, edit, dan pencarian.
    5. Didalam object pelanggan dapat melakukan input data pelanggan, edit, dan pencarian.
    6. Didalam object metode pembayaran, dapat melakukan input dan update
    7. Didalm object invoice dapat melakukan input dan pencarian, pengurutan berdasarkan paling banyak, paling dekat waktu tempo, dan update status pembayaran.
    8. Setiap proses selesai dilakukan, pengguna (pemilik warung) ditanya apakah ingin melanjutkan program atau ingin menghentikannya.

Implementasi dari 5 Materi Algoritma dan Pemprograman 2 :
    1.	Pada program catatan hutang ini menggunakan abstract data type (ADT) untuk memisahkan struktur penyimpanan dari beberapa object antara lain, pelanggan, barang, metode  pembayaran dan tagihan. 
    2.	Struktur data yang digunakan yaitu array dengan tipe arraylist untuk mempermudah menyimpan data yang menghutang dan pemilik warung juga bisa menambah dan mengupdate data yang telah diinisialisasi.
    3.	Perulangan yang digunakan yaitu while dan for. Perulangan while digunakan untuk membuat menu awal dari beberapa object seperti pelanggan, barang, metode pembayaran dan tagihan.
    4.	Perkondisian yang digunakan yaitu if…else if…else. Perkondisian ini digunakan pada setiap menu crud seperti input, update, cari dan urut, sehingga pemilik warung dapat memilih menu tersebut.
    5.	Pencarian yang digunakan yaitu sequential search. Pencarian ini memudahkan pemilik warung dalam mencari data orang yang menghutang seperti pada menu crud object invoice. Dengan menginput id orang yang menghutang, maka akan keluar tampilan datanya.
    6.	Pengurutan digunakan pada menu object tagihan yaitu mengurutkan nominal hutang dan tempo pembayaran. Dua pengurutan tersebut terdapat di menu crud, sehingga pemilik warung dapat melihat data orang yang menghutang berdasarkan urutan nominal hutang yang terbanyak hingga sedikit atau tempo pembayaran yang masih lama atau terdekat.
