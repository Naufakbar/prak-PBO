/* Nama File    : IResize.Java 
 * Deskripsi    : IResize
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 26 Maret 2026
 */

public interface IResize {
    //menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menambah ukuran sesuai dengan input persen yang diberikan
    public void zoom(int percent);
} 
