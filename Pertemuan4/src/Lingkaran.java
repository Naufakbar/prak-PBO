/* Nama File    : Lingkaran.Java 
 * Deskripsi    : class BangunDatar
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 12 Maret 2026
 */

public class Lingkaran extends BangunDatar{
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
        System.out.println("Jari-jari    : " + Jari);
    }

}
