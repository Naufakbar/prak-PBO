/* Nama File    : Persegi.Java 
 * Deskripsi    : class Persegi
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 26 Maret 2026
 */
public class Persegi extends BangunDatar implements IResize{
    //Atribut
    private double sisi;

    // Konstruktor
    public Persegi (){
        setJmlSisi(4);
    }

    public Persegi (double sisi, String warna, String Border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(Border);
        setJmlSisi(4);
    }

    // Selektor
    public double getSisi(){
        return sisi;
    }

    // Mutator
    public void setSisi (double sisi){
        this.sisi = sisi;
    }
    // Method lain
    public double getKeliling(){
        return 4*sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: "+ sisi);
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1; 
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9; 
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100.0; 
        
    }
}
