//Nama       : Naufal Akbar Nugroho
//NIM        : 24060124130057
//Tanggal    : 30/4/2026

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing() {
        super();
        this.bobot = 0.0;
    }

    public Kucing(String Nama, double bobot) {
        super(Nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    public Kucing(String nama) {
        super(nama);
    }
    public void printBobot(){
        System.out.println("bobotnya adalah"+ getBobot());
    }
    
    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}