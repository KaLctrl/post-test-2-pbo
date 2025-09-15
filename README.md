# post-test-2-pbo

# CRUD Daftar Destinasi Wisata

Program ini adalah implementasi **CRUD (Create, Read, Update, Delete)** dengan tema **Destinasi Wisata**.  
Dibuat menggunakan **Java** dengan struktur **OOP**, memanfaatkan packages untuk pemisahan class.

## Fitur
- Tambah destinasi wisata.
  <img width="313" height="257" alt="tambah2" src="https://github.com/user-attachments/assets/9ebcea82-b18a-4f9a-8bfd-40155326c1ff" />

- Lihat daftar destinasi wisata.
  <img width="362" height="237" alt="lihat2" src="https://github.com/user-attachments/assets/fe4268aa-a9ed-4d09-8744-e7402cb0ee8d" />

- Edit destinasi wisata.
  <img width="405" height="345" alt="edit2" src="https://github.com/user-attachments/assets/35b13237-db12-4920-9465-dc26beb7b2c9" />

- Hapus destinasi wisata.
  <img width="478" height="282" alt="hapus2" src="https://github.com/user-attachments/assets/bb20e068-bdf5-42ec-a564-55abbf6df59d" />

- Cari destinasi wisata berdasarkan nama/lokasi/kategori.
  <img width="477" height="222" alt="cari" src="https://github.com/user-attachments/assets/d4ab947d-c382-49ed-b498-2c825e221bc4" />

- Validasi input angka pada menu Program dilengkapi validasi input pada menu utama.
  <img width="281" height="190" alt="validasi input" src="https://github.com/user-attachments/assets/1f3b05d3-c69e-458c-b94b-06266ca14343" />
Jika user memasukkan input bukan angka (misalnya huruf/simbol), program akan menampilkan pesan error dan meminta user menginput ulang.  
Hal ini mencegah program error (InputMismatchException) dan menjaga program tetap berjalan.

## Alur Program
1. User memilih menu.
2. Data destinasi disimpan dalam **ArrayList** di `Service`.
3. Program berjalan terus hingga user memilih keluar.
4. Data bisa dicari, diedit, atau dihapus sesuai input user.

### Struktur Packages (MVC)
- `model` → berisi class `model` yang menyimpan struktur data (atribut dan constructor).
- `service` → berisi class `Service` yang mengelola logika CRUD (create, read, update, delete, search).
- `main` → berisi class `Main` sebagai entry point dan tempat menu interaksi dengan user.


