/* Nama File    : Pengusaha.java 
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 14 April 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public Pengusaha(String nama, int tgl, String alamat, double pendapatan, String npwp) {
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

     public String getNpwp(){
        return npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja(){
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + 5;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.15;
    }
}