public class MGaris {
    public static void main(String[] args) {
        Titik A = new Titik(-4,0);
        Titik B = new Titik(0,7);
        Titik C = new Titik(1,0);
        Titik D = new Titik(8,4);

        
        Garis G1 = new Garis(A,B);
        Garis G2 = new Garis(C,D);
        Garis G3 = new Garis(); 

        
        Garis G4 = new Garis(D,A);
        System.out.println("Titik G4 = ");
        G4.printGaris();
        G4.setTitikAwal(new Titik(2,3));
        G4.setTitikAkhir(new Titik(5,6));
        System.out.println("Titik G4 sekarang = ");
        G4.printGaris();


        System.out.println("Titik G1 = ");
        G1.printGaris();
        System.out.println("Titik G2 = ");
        G2.printGaris();
        System.out.println("Titik G3 = ");
        G3.printGaris();

        System.out.println("Panjang G1 = " + G1.getPanjang());
        System.out.println("Gradien G1 = " + G1.getGradien());

        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik Tengah G1 = ");
        tengah.printTitik();


        System.out.println("G1 sejajar G2 = "
                + G1.isSejajar(G2));

        System.out.println("G1 tegak lurus G2 = "
                + G1.isTegakLurus(G2));

     
        System.out.println("Persamaan G1 : "
                + G1.getPersamaanGaris());


        System.out.println("Jumlah Garis = "
                + Garis.getCounterGaris());
    }
}
