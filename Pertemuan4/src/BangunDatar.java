/* Nama File    : BangunDatar.Java 
 * Deskripsi    : class BangunDatar
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 12 Maret 2026
 */

public class BangunDatar {
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

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
    
}
