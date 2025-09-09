package com.mycompany.posttest1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static class Surat {
        String judul, nomor, tanggal, status;

        Surat(String judul, String nomor, String tanggal) {
            this.judul = judul;
            this.nomor = nomor;
            this.tanggal = tanggal;
            this.status = "Pending";
        }
    }
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        ArrayList<Surat>daftarSurat = new ArrayList<>();
        
        
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {            
            System.out.println("======= Menu Utama =======");
            System.out.println("1. Membuat Surat");
            System.out.println("2. Tampilkan Daftar Surat");
            System.out.println("3. Update Status Surat");
            System.out.println("4. Menghapus Surat");
            System.out.println("0. Keluar");
            System.out.println("==========================");
            System.out.print("Masukkan Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1: 
                    System.out.print("Masukkan Nama Surat: ");
                    String Judul = input.nextLine();
                    
                    System.out.print("Masukkan Nomor Surat: ");
                    String Nomor = input.nextLine();
                    
                    System.out.print("Masukkan Tanggal Masuk Surat (dd/mm/yyy): ");
                    String Tanggal = input.nextLine();
                    
                    daftarSurat.add(new Surat(Judul, Nomor, Tanggal));
                    System.out.println("Surat Telah Ditambahkan");
                    break;
                
                case 2:
                    if (daftarSurat.isEmpty()) {
                        System.out.println("Belum ada surat");
                    }else{
                        for ( Surat i : daftarSurat) {
                        System.out.println("Nama Surat : " + i.judul);
                        System.out.println("Nomor Surat : " + i.nomor);
                        System.out.println("Tanggal Masuk Surat : " + i.tanggal);
                        System.out.println("Status Surat : " + i.status);
                        System.out.println("--------------------------");
                        }
                    }
                    break;
                    
                case 3:
                    System.out.print("Masukkan Nomor Surat: ");
                    String cariNomor = input.nextLine();
                    
                    for ( Surat i : daftarSurat) {
                        if (i.nomor.equals(cariNomor)) {
                            System.out.print("Masukkan status surat terbaru: ");
                            String statusBaru = input.nextLine();
                            i.status = statusBaru;
                            System.out.println("Status Surat Telah TerUpdate");
                        } else{
                            System.out.println("Surat Tidak Ada");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nomor Surat: ");
                    cariNomor = input.nextLine();
                    
                    for (int i = 0; i < daftarSurat.size(); i++) {
                        if (daftarSurat.get(i).nomor.equals(cariNomor)) {
                            daftarSurat.remove(i);
                            System.out.println("Surat Berhasil Dihapus");
                        } else{
                            System.out.println("Surat Tidak Ada");
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Terima kasih telah menggunakan program kami");
                    break;
                
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }while (pilihan != 0 );
        input.close();
    }
}
    
