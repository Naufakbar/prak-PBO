/* Nama File    : MBangunDatar.Java 
 * Deskripsi    : berisi implementasi class yang sudah dibuat
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 26 Maret 2026
 */
public class MBangunDatar {
    public static void main(String[] args) {
        //Implementasi Abstract
        BangunDatar P1 = new Persegi(10, "Kuning", "Merah");
        Persegi P2 = new Persegi(5, "Hijau", "Merah");
        BangunDatar L1 = new Lingkaran(7, "Hitam", "Merah");
        Lingkaran L2 = new Lingkaran(14, "Orange", "Merah" );
        
        System.out.println("Luas Persegi P1 : " + P1.getLuas());
        System.out.println("Luas Persegi P2 : " + P2.getLuas());
        System.out.println("Luas Lingkaran L1 : " + L1.getLuas());
        System.out.println("Luas Lingkaran L2 : " + L2.getLuas());

        System.out.println("Apakah luas P1 sama dengan luas P2? " + P1.isEqualLuas(P2));
        System.out.println("Apakah luas L1 sama dengan luas L2? " + L1.isEqualLuas(L2));

        //implementasi IResize
        ((Persegi) P1).zoomIn();
        P2.zoomOut();
        System.out.println("Sisi setelah : " + ((Persegi)P1).getSisi());
       
    }
}

