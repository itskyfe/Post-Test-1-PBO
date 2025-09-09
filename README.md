Muhammad Rizky Febrianto | 2409116045
#  Program Manajemen Surat di Kelurahan

## Deskripsi Singkat

Program ini dibuat menggunakan bahasa pemrograman Java yang dilengkapi fitur CRUD (Create, Read, Update, Delete) dan Menerapkan perulangan agar program tidak berhenti kecuali user memilih menu keluar.
Program memungkinkan pengguna untuk:

* Membuat surat baru dengan judul, nomor, dan tanggal.
* Melihat daftar surat yang sudah dimasukkan.
* Memperbarui status surat berdasarkan nomor surat.
* Menghapus surat berdasarkan nomor surat.
* Keluar dari program.

## Alur Program

1. Tampilan Menu Utama
   User diberikan 5 pilihan menu: Membuat Surat, Lihat Daftar Surat, Update Status, Hapus Surat, atau Keluar.
   Input menu diproses menggunakan `switch-case`.

   <img width="204" height="143" alt="image" src="https://github.com/user-attachments/assets/1dde46ae-af8f-47a8-b278-2db237b50732" />


3. Membuat Surat (Create)

   * Input: Judul, Nomor, dan Tanggal surat.
   * Surat otomatis memiliki status default `"Pending"`.
   * Disimpan ke dalam `ArrayList<Surat>`.
     
     <img width="369" height="205" alt="image" src="https://github.com/user-attachments/assets/262ff6fb-72a7-436f-b7f7-d78ad001bd7b" />

4. Tampilkan Daftar Surat (Read)

   * Jika daftar kosong maka akan tampil pesan `"Belum ada surat"`.
     
     <img width="205" height="155" alt="image" src="https://github.com/user-attachments/assets/99eab342-ecf2-4c31-a30b-81751a1def6a" />

   * Jika ada maka akan tampil semua surat dengan format:
     
     <img width="302" height="222" alt="image" src="https://github.com/user-attachments/assets/c79b3497-de8a-4a07-ad23-4281c9ba645b" />

5. Update Status Surat (Update)

   * Cari surat berdasarkan Nomor Surat.
   * Jika ketemu, user bisa mengganti status (misalnya: `"Selesai"`, `"Dalam Proses"`).
   * Jika tidak ditemukan maka akan tampil pesan `"Surat Tidak Ada"`.
     
     <img width="302" height="412" alt="image" src="https://github.com/user-attachments/assets/b06e698a-9a63-457d-b964-f0f808bb373f" />

6. Menghapus Surat (Delete)

   * Cari surat berdasarkan Nomor Surat.
   * Jika ketemu maka surat dihapus dari daftar.
   * Jika tidak ditemukan maka akan tampil pesan `"Surat Tidak Ada"`.

     <img width="208" height="324" alt="image" src="https://github.com/user-attachments/assets/18542e33-4493-4f68-a643-8438ab227c2d" />


7. Keluar Program

   * Program berhenti saat user memilih menu `0`.
     
     <img width="320" height="159" alt="image" src="https://github.com/user-attachments/assets/110afb28-96e4-4c5d-ae32-c8032cffa73f" />
