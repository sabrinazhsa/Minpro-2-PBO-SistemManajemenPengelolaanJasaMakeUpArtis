/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP VICTUS
 */

public class PemesananLayananMUA {

    private String idPesanan;
    private String tanggalPesanan;
    private String jenisMakeup;
    private double totalHarga;
    private String status;
    private Pelanggan pelanggan;

    public PemesananLayananMUA(String idPesanan, String tanggalPesanan,
            String jenisMakeup, double totalHarga, String status,
            Pelanggan pelanggan) {

        this.idPesanan = idPesanan;
        this.tanggalPesanan = tanggalPesanan;
        this.jenisMakeup = jenisMakeup;
        this.totalHarga = totalHarga;
        this.status = status;
        this.pelanggan = pelanggan;
    }

    public double hitungTotalBiaya() {
        return totalHarga;
    }

    public void tampilkanDetailPesanan() {
        System.out.println("ID Pesanan: " + idPesanan);
        System.out.println("Tanggal   : " + tanggalPesanan);
        System.out.println("Jenis Make Up     : " + jenisMakeup);
        System.out.println("Total Harga:   " + totalHarga);
        System.out.println("Status Pembayaran : " + status);
    }

    public String getidPesanan() { 
        return idPesanan; 
    }
    
    public String gettanggalPesanan() { 
        return tanggalPesanan; 
    }
    
    public String getIdPesanan() { 
        return idPesanan; 
    }
    
    public void setIdPesanan(String idPesanan) { 
        this.idPesanan = idPesanan; 
    }
    
    public String getTanggalPesanan() { 
        return tanggalPesanan; 
    }
    
    public void setTanggalPesanan(String tanggalPesanan) { 
        this.tanggalPesanan = tanggalPesanan; 
    }
    
    public String getJenisMakeup() { 
        return jenisMakeup; 
    }
    
    public void setJenisMakeup(String jenisMakeup) { 
        this.jenisMakeup = jenisMakeup; 
    }
    
    public double getTotalHarga() { 
        return totalHarga; 
    }
    
    public void setTotalHarga(double totalHarga) { 
        this.totalHarga = totalHarga; 
    }
    
    public String getStatus() { 
        return status; 
    }
    
    public void setStatus(String status) { 
        this.status = status; 
    }
    
    public String getjenisMakeup() { 
        return jenisMakeup; 
    }
    
    public double gettotalHarga() { 
        return totalHarga; 
    }
    
    public String getstatus() { 
        return status; 
    }
    public Pelanggan getPelanggan() { 
        return pelanggan; 
    }
    
    public void setjenisMakeup(String jenisMakeup) { 
        this.jenisMakeup = jenisMakeup; 
    }
    
    public void settotalHarga(double totalHarga) { 
        this.totalHarga = totalHarga; 
    }
    
    public void setstatus(String status) { 
        this.status = status; 
    }
}