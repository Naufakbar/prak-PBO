/* Nama File    : Petani.java 
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 14 April 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
}

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public Petani(String nama, int tgl, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota(){
        return asal_kota;
    }

    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }
    
    @Override
    public int hitungMasaKerja(){
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + 0;
    }
    
    @Override
    public double hitungPajak() {
        return 0;
    }
}
