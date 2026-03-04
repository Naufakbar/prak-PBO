public class Garis {

    Titik awal;
    Titik akhir;
    static int CounterGaris = 0;

    public Garis (){
        this(new Titik(0,0), new Titik(1,1));
    }

     Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        CounterGaris++;
    }

    Titik getTitikAwal() {
        return awal;
    }

    Titik getTitikAkhir() {
        return akhir;
    }

    
    static int getCounterGaris() {
        return CounterGaris;
    }

    void setTitikAwal(Titik t) {
        awal = t;
    }

    void setTitikAkhir(Titik t) {
        akhir = t;
    }

    double getPanjang() {
        return awal.getJarak(akhir);
    }

    
    double getGradien() {
        return (akhir.getOrdinat() - awal.getOrdinat()) /
               (akhir.getAbsis() - awal.getAbsis());
    }

    Titik getTitikTengah() {

        double x = (awal.getAbsis() +
                    akhir.getAbsis()) / 2;

        double y = (awal.getOrdinat() +
                    akhir.getOrdinat()) / 2;

        return new Titik(x,y);
    }

    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    void printGaris() {

        System.out.println("Titik Awal : (" +
                awal.getAbsis() + "," +
                awal.getOrdinat() + ")");

        System.out.println("Titik Akhir : (" +
                akhir.getAbsis() + "," +
                akhir.getOrdinat() + ")");
    }

    String getPersamaanGaris() {

        double m = getGradien();
        double x = awal.getAbsis();
        double y = awal.getOrdinat();
        double c = y - m*x;
        return "y = " + m + "x + " + c;
    }




}
