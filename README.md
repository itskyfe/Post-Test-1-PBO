Muhammad Rizky Febrianto | 2409116045
#  Program Manajemen Surat di Kelurahan

## Deskripsi Singkat

Program **Manajemen Surat** ini dibuat menggunakan bahasa Java dengan konsep **CRUD (Create, Read, Update, Delete)**.
Program memungkinkan pengguna untuk:

* Membuat surat baru dengan judul, nomor, dan tanggal.
* Melihat daftar surat yang sudah dimasukkan.
* Memperbarui status surat berdasarkan nomor surat.
* Menghapus surat tertentu.
* Keluar dari program.

---

## Alur Program

1. **Tampilan Menu Utama**
   User diberikan 5 pilihan menu: Membuat Surat, Lihat Daftar Surat, Update Status, Hapus Surat, atau Keluar.
   Input menu diproses menggunakan `switch-case`.

2. **Membuat Surat (Create)**

   * Input: Judul, Nomor, dan Tanggal surat.
   * Surat otomatis memiliki status default `"Pending"`.
   * Disimpan ke dalam `ArrayList<Surat>`.

3. **Tampilkan Daftar Surat (Read)**

   * Jika daftar kosong → tampil pesan `"Belum ada surat"`.
   * Jika ada → tampil semua surat dengan format:

     ```
     Nama Surat : Undangan Rapat
     Nomor Surat : 001/A/2025
     Tanggal Masuk Surat : 09/09/2025
     Status Surat : Pending
     ```

4. **Update Status Surat (Update)**

   * Cari surat berdasarkan **Nomor Surat**.
   * Jika ketemu, user bisa mengganti status (misalnya: `"Selesai"`, `"Dalam Proses"`).
   * Jika tidak ditemukan → tampil pesan `"Surat Tidak Ada"`.

5. **Menghapus Surat (Delete)**

   * Cari surat berdasarkan **Nomor Surat**.
   * Jika ketemu → surat dihapus dari daftar.
   * Jika tidak ditemukan → tampil pesan `"Surat Tidak Ada"`.

6. **Keluar Program**

   * Program berhenti saat user memilih menu `0`.

---

## Penjelasan Kode

1. **Deklarasi Class dan Struktur Data**

```java
static class Surat {
    String judul, nomor, tanggal, status;

    Surat(String judul, String nomor, String tanggal) {
        this.judul = judul;
        this.nomor = nomor;
        this.tanggal = tanggal;
        this.status = "Pending";
    }
}
```

Program menggunakan **class Surat** untuk menyimpan data surat dengan atribut `judul`, `nomor`, `tanggal`, dan `status`. Default status adalah `"Pending"`.

2. **ArrayList untuk Menyimpan Data**

```java
ArrayList<Surat> daftarSurat = new ArrayList<>();
```

Semua surat yang dibuat akan disimpan di dalam `daftarSurat`.

3. **Menu Utama dengan Do-While**

```java
do {
    System.out.println("======= Menu Utama =======");
    System.out.println("1. Membuat Surat");
    System.out.println("2. Tampilkan Daftar Surat");
    System.out.println("3. Update Status Surat");
    System.out.println("4. Menghapus Surat");
    System.out.println("0. Keluar");
    ...
} while (pilihan != 0);
```

Menu ditampilkan berulang hingga user memilih keluar (`0`).

4. **Menambahkan Surat**

```java
case 1:
    System.out.print("Masukkan Nama Surat: ");
    String Judul = input.nextLine();

    System.out.print("Masukkan Nomor Surat: ");
    String Nomor = input.nextLine();

    System.out.print("Masukkan Tanggal Masuk Surat (dd/mm/yyyy): ");
    String Tanggal = input.nextLine();

    daftarSurat.add(new Surat(Judul, Nomor, Tanggal));
    System.out.println("Surat Telah Ditambahkan");
    break;
```

User menginput judul, nomor, dan tanggal. Surat otomatis tersimpan dengan status `"Pending"`.

5. **Menampilkan Daftar Surat**

```java
case 2:
    if (daftarSurat.isEmpty()) {
        System.out.println("Belum ada surat");
    } else {
        for (Surat i : daftarSurat) {
            System.out.println("Nama Surat : " + i.judul);
            System.out.println("Nomor Surat : " + i.nomor);
            System.out.println("Tanggal Masuk Surat : " + i.tanggal);
            System.out.println("Status Surat : " + i.status);
            System.out.println("--------------------------");
        }
    }
    break;
```

Program akan menampilkan seluruh surat yang sudah ada. Jika kosong, tampilkan pesan `"Belum ada surat"`.

6. **Update Status Surat**

```java
case 3:
    System.out.print("Masukkan Nomor Surat: ");
    String cariNomor = input.nextLine();

    for (Surat i : daftarSurat) {
        if (i.nomor.equals(cariNomor)) {
            System.out.print("Masukkan status surat terbaru: ");
            String statusBaru = input.nextLine();
            i.status = statusBaru;
            System.out.println("Status Surat Telah TerUpdate");
        } else {
            System.out.println("Surat Tidak Ada");
        }
    }
    break;
```

User memasukkan nomor surat → status surat akan diperbarui. Jika tidak ada, tampil pesan `"Surat Tidak Ada"`.

7. **Menghapus Surat**

```java
case 4:
    System.out.print("Masukkan Nomor Surat: ");
    cariNomor = input.nextLine();

    for (int i = 0; i < daftarSurat.size(); i++) {
        if (daftarSurat.get(i).nomor.equals(cariNomor)) {
            daftarSurat.remove(i);
            System.out.println("Surat Berhasil Dihapus");
        } else {
            System.out.println("Surat Tidak Ada");
        }
    }
    break;
```

User memasukkan nomor surat → jika ketemu, data surat dihapus dari `ArrayList`.

8. **Keluar Program**

```java
case 0:
    System.out.println("Terima kasih telah menggunakan program kami");
    break;
```

Program berhenti ketika user memilih `0`.

---

## Output Program (Ilustrasi)

1. **Menu Utama**

```
======= Menu Utama =======
1. Membuat Surat
2. Tampilkan Daftar Surat
3. Update Status Surat
4. Menghapus Surat
0. Keluar
==========================
Masukkan Pilihan Anda:
```

2. **Tambah Surat**

```
Masukkan Nama Surat: Undangan Rapat
Masukkan Nomor Surat: 001/A/2025
Masukkan Tanggal Masuk Surat (dd/mm/yyyy): 09/09/2025
Surat Telah Ditambahkan
```

3. **Lihat Daftar Surat**

```
Nama Surat : Undangan Rapat
Nomor Surat : 001/A/2025
Tanggal Masuk Surat : 09/09/2025
Status Surat : Pending
--------------------------
```

4. **Update Status Surat**

```
Masukkan Nomor Surat: 001/A/2025
Masukkan status surat terbaru: Selesai
Status Surat Telah TerUpdate
```

5. **Hapus Surat**

```
Masukkan Nomor Surat: 001/A/2025
Surat Berhasil Dihapus
```

6. **Keluar**

```
Terima kasih telah menggunakan program kami
```

---

👉 Apakah mau saya buatkan versi **README.md** siap pakai seperti file yang Anda upload, biar bisa langsung dipakai di repo Anda?
