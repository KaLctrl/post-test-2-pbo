/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author user
 */





import service.service;
import java.util.Scanner;
import model.model;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        service service = new service();

        while (true) {
            System.out.println("\n=== MENU DESTINASI WISATA ===");
            System.out.println("1. Tambah Destinasi");
            System.out.println("2. Lihat Daftar Destinasi");
            System.out.println("3. Edit Destinasi");
            System.out.println("4. Hapus Destinasi");
            System.out.println("5. Cari Destinasi");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            
            if (!input.hasNextInt()) {
                System.out.println("⚠️ Input harus berupa angka!");
                input.nextLine();
                continue;
            }
            
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                System.out.print("Masukkan nama destinasi: ");
                String nama = input.nextLine();
                System.out.print("Masukkan lokasi: ");
                String lokasi = input.nextLine();
                System.out.print("Masukkan kategori: ");
                String kategori = input.nextLine();

                service.tambahDestinasi(new model(nama, lokasi, kategori));

            } else if (pilih == 2) {
                service.tampilkanDestinasi();

            } else if (pilih == 3) {
                service.tampilkanDestinasi();
                System.out.print("Masukkan nomor destinasi yang akan diedit: ");
                int index = input.nextInt();
                input.nextLine();

                System.out.print("Nama baru: ");
                String nama = input.nextLine();
                System.out.print("Lokasi baru: ");
                String lokasi = input.nextLine();
                System.out.print("Kategori baru: ");
                String kategori = input.nextLine();

                service.editDestinasi(index - 1, new model(nama, lokasi, kategori));

            } else if (pilih == 4) {
                service.tampilkanDestinasi();
                System.out.print("Masukkan nomor destinasi yang akan dihapus: ");
                int index = input.nextInt();
                input.nextLine();

                service.hapusDestinasi(index - 1);

            } else if (pilih == 5) {
                System.out.print("Masukkan kata kunci pencarian: ");
                String keyword = input.nextLine();
                service.cariDestinasi(keyword);

            } else if (pilih == 6) {
                System.out.println("👋 Terima kasih! Program selesai.");
                break;

            } else {
                System.out.println("⚠️ Menu tidak tersedia.");
            }
        }

        input.close();
    }
}

