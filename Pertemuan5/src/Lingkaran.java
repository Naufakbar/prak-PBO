/* Nama File    : Lingkaran.Java 
 * Deskripsi    : class Lingkaran
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 26 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize{
    //Atribut
    private double Jari;

    // Konstruktor
    public Lingkaran (){
        setJmlSisi(0);;
    }

    public Lingkaran(double Jari, String warna, String Border ){
        this.Jari = Jari;
        setWarna(warna);
        setBorder(Border);
        setJmlSisi(0);
    } 

    // Selektor (Getter)
    public double getJari(){
        return Jari;
    }

    // Method lain
    public double getLuas(){
        return Math.PI * Jari * Jari;
    }

    public double getKeliling(){
        return Math.PI *2 * Jari ;
    }

    //Mutator (Setter)
    public void setJari(double Jari){
        this.Jari = Jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + Jari);
    }

    @Override
    public void zoomIn() { 
        Jari *= 1.1; 
    }

    @Override
    public void zoomOut() {
        Jari *= 0.9; 
    }

    @Override
    public void zoom(int percent) {
        Jari *= (1 + percent / 100.0); 
        
    }
}
