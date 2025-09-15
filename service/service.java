/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author user
 */



import java.util.ArrayList;
import model.model;

public class service {
    private ArrayList<model> daftarWisata = new ArrayList<>();

  
    public void tambahDestinasi(model d) {
        daftarWisata.add(d);
        System.out.println("✅ Destinasi berhasil ditambahkan!");
    }


    public void tampilkanDestinasi() {
        if (daftarWisata.isEmpty()) {
            System.out.println("⚠️ Belum ada destinasi yang tersimpan.");
        } else {
            System.out.println("\n=== DAFTAR DESTINASI ===");
            for (int i = 0; i < daftarWisata.size(); i++) {
                System.out.println((i + 1) + ". " + daftarWisata.get(i));
            }
        }
    }

 
    public void editDestinasi(int index, model dBaru) {
        if (index >= 0 && index < daftarWisata.size()) {
            daftarWisata.set(index, dBaru);
            System.out.println("✅ Data destinasi berhasil diperbarui!");
        } else {
            System.out.println("⚠️ Nomor tidak valid.");
        }
    }

   
    public void hapusDestinasi(int index) {
        if (index >= 0 && index < daftarWisata.size()) {
            daftarWisata.remove(index);
            System.out.println("✅ Destinasi berhasil dihapus!");
        } else {
            System.out.println("⚠️ Nomor tidak valid.");
        }
    }


    public void cariDestinasi(String keyword) {
        boolean found = false;
        for (model d : daftarWisata) {
            if (d.getNama().toLowerCase().contains(keyword.toLowerCase()) ||
                d.getLokasi().toLowerCase().contains(keyword.toLowerCase()) ||
                d.getKategori().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("🔍 " + d);
                found = true;
            }
        }
        if (!found) {
            System.out.println("⚠️ Tidak ditemukan destinasi dengan kata kunci: " + keyword);
        }
    }
}

