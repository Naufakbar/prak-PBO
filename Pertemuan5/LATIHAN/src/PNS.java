/* Nama File    : PNS.java 
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 14 April 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS() {
        super(); 
        this.nip = "";
        counterPNS++;
    }
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, int tgl, String alamat, double pendapatan, String nip) {
        super(nama, tgl, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, int tgl, double pendapatan, String nip) {
        super(nama, tgl, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }
   public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }
    
    @Override
    public int hitungMasaKerja(){
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + 7;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.1;
    }
}
