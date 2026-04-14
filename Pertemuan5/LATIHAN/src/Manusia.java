/* Nama File    : Manusia.java 
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 14 April 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia() {
    this.nama = "";
    this.tgl_mulai_kerja = LocalDate.now(); 
    this.alamat = "";
    this.pendapatan = 0.0;
    counterMns++;
}
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public Manusia(String nama, int tgl, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

  public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public abstract int hitungMasaKerja();
}