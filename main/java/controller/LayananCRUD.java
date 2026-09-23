/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;
import model.Pelanggan;
import model.PemesananLayananMUA;
import model.MakeUpPengantin;
import model.MakeUpWisuda;

/**
 *
 * @author HP VICTUS
 */
public class LayananCRUD {

    private ArrayList<PemesananLayananMUA> daftarPesanan = new ArrayList<>();
    private int counterId = 1;
 
    public LayananCRUD() {
        tampilDataAwal();
    }
 
    private void tampilDataAwal() {
        Pelanggan pelanggan1 = new Pelanggan("Madison Brr", "Jl. Melati No. 10, Samarinda", "081234567890");
        PemesananLayananMUA pesanan1 = new MakeUpWisuda(generateIdPesanan(), "20/09/2026", "Lunas", pelanggan1, 1, true);
        
        daftarPesanan.add(pesanan1);
 
    }
    public String generateIdPesanan() {
        return "P0" + String.format("%01d", counterId++);
    }
    
    public void tambahPemesanan(PemesananLayananMUA pesanan) {
        if (pesanan == null) {
            System.out.println("Data pesanan tidak boleh kosong!");
            return;
        }

        if (cariPemesanan(pesanan.getidPesanan()) != null) {
            System.out.println("ID Pesanan [" + pesanan.getidPesanan() + "] sudah digunakan. Gunakan ID lain!");
            return;
        }

        daftarPesanan.add(pesanan);
        System.out.println("Pesanan dengan ID [" + pesanan.getidPesanan() + "] berhasil ditambahkan!");
    }

    public void tampilkanSemuaPemesanan() {
    if (daftarPesanan.isEmpty()) {
        System.out.println("Belum ada pemesanan yang masuk.");
        return;
    }

    NumberFormat formatRupiah = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    System.out.println("\n--- DAFTAR PESANAN ---");

    for (int i = 0; i < daftarPesanan.size(); i++) {

        PemesananLayananMUA p = daftarPesanan.get(i);
        Pelanggan pelanggan = p.getPelanggan();
        
        System.out.println("   -----------------------------------------------------------------");
        System.out.println((i + 1) + ". ID Pesanan          : " + p.getidPesanan());
        System.out.println("   Nama Pelanggan      : " + pelanggan.getnamaPelanggan());
        System.out.println("   Alamat Pelanggan    : " + pelanggan.getalamat());
        System.out.println("   Nomor HP            : " + pelanggan.getnoHP());
        System.out.println("   Jenis Makeup        : " + p.getjenisMakeup());
        System.out.println("   Tanggal Pengerjaan  : " + p.gettanggalPesanan());
        System.out.println("   Total Harga         : Rp" + formatRupiah.format(p.gettotalHarga()));
        System.out.println("   Status Pembayaran   : " + p.getstatus());
        System.out.println("   -----------------------------------------------------------------");
    }
}

    public PemesananLayananMUA cariPemesanan(String getIdPesanan) {
        if (getIdPesanan == null) {
            return null;
        }
        for (PemesananLayananMUA p : daftarPesanan) {
            if (p.getidPesanan().equals(getIdPesanan)) {
                return p;
            }
        }
        return null;
    }

    public void updatePemesanan(String getIdPesanan, String statusBaru, double hargaBaru) {
        PemesananLayananMUA p = cariPemesanan(getIdPesanan);

        if (p == null) {
            System.out.println("Pesanan dengan ID [" + getIdPesanan + "] tidak ditemukan.");
            return;
        }

        if (hargaBaru < 0) {
            System.out.println("Harga tidak boleh bernilai negatif!");
            return;
        }

        p.setstatus(statusBaru);
        p.settotalHarga(hargaBaru);
        System.out.println("Data pesanan [" + getIdPesanan + "] berhasil diperbarui!");
    }

    public void hapusPemesanan(String idPesananCari) {
        boolean berhasil = daftarPesanan.removeIf(p -> p.getidPesanan().equals(idPesananCari));

        if (berhasil) {
            System.out.println("Pesanan [" + idPesananCari + "] berhasil dihapus!");
        } else {
            System.out.println("Pesanan dengan ID [" + idPesananCari + "] tidak ada!!!");
            
        }
        
    }
}
