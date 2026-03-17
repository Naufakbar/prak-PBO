/* Nama File    : MBangunDatar.Java 
 * Deskripsi    : berisi implementasi class yang sudah dibuat
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 12 Maret 2026
 */
public class MBangunDatar {
    public static void main(String[] args) {
        // Bangun datar
        System.out.println("Bangun Datar ");
        BangunDatar BD1 = new BangunDatar(3, "Hijau", "Merah");
        BD1.printInfo();
        System.out.println();
        
        BangunDatar BD2 = new BangunDatar();
        BD2.setJmlSisi(6);
        BD2.setWarna("Kuning");
        BD2.setBorder("Pink");
        BD2.printInfo();
        System.out.println();
        
        // Objek Persegi dari BangunDatar 
        System.out.println("Persegi dari BangunDatar ");
        BangunDatar P3 = new Persegi(4, "Jingga", "Hitam");
        P3.printInfo();
        System.out.println("Keliling    : " + ((Persegi)(P3)).getKeliling());
        System.out.println("Luas        : " + ((Persegi)(P3)).getLuas());
        System.out.println("Diagonal    : " + ((Persegi)(P3)).getDiagonal());
        System.out.println();
        
        // Objek Lingkaran dari BangunDatar 
        System.out.println("Lingkaran dari BangunDatar ");
        BangunDatar L3 = new Lingkaran(5, "Biru", "Nila");
        P3.printInfo();
        System.out.println("Keliling    : " + ((Lingkaran)(L3)).getKeliling());
        System.out.println("Luas        : " + ((Lingkaran)(L3)).getLuas());
        System.out.println();
        
        
        //  Persegi 
        System.out.println("Persegi ");
        Persegi P1 = new Persegi(5.0, "Hitam", "Ungu");
        P1.printInfo();
        System.out.println("Keliling    : " + P1.getKeliling());
        System.out.println("Luas        : " + P1.getLuas());
        System.out.println("Diagonal    : " + P1.getDiagonal());
        System.out.println();

        // Lingkaran 
        System.out.println("Lingkaran ");
        Lingkaran L1 = new Lingkaran(7.0, "Nila", "Putih");
        L1.printInfo();
        System.out.println("Keliling    : " + L1.getKeliling());
        System.out.println("Luas        : " + L1.getLuas());
        System.out.println();
    }
}

