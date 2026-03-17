/* Nama File    : Persegi.Java 
 * Deskripsi    : class BangunDatar
 * Pembuat      : Naufal Akbar Nugroho / 24060124130057
 * Tanggal      : 12 Maret 2026
 */
public class Persegi extends BangunDatar {
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

}
