/* Nama File    : BangunDatar.Java 
 * Deskripsi    : class BangunDatar
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 26 Maret 2026
 */

public abstract class BangunDatar {
    // Atribut
    private int Jmlsisi;
    private String warna;
    private String Border;
    private static int counterBangunDatar = 0;

    // Konstruktor
    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int Jmlsisi, String warna, String Border){
        this.Jmlsisi = Jmlsisi;
        this.warna = warna;
        this.Border = Border;
        counterBangunDatar++;
    }

    // Selektor (Getter)
    public int getJmlsisi(){
        return Jmlsisi;
    }
    
    public String getBorder(){
        return Border;
    }

    public String getWarna(){
        return warna;
    }

    // Mutator (Setter)
    public void setJmlSisi(int Jmlsisi){
        this.Jmlsisi = Jmlsisi;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String Border){
        this.Border = Border;
    }

    
    // Method lain
    public void printInfo(){
        System.out.println("Jumlah Sisi : " + Jmlsisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + Border);
    }
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling()== X.getKeliling();
    }
    // Tambahan abstract class
    public abstract double getLuas();
    public abstract double getKeliling();
    
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
    
}
