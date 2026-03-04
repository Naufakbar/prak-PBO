/*  Nama File   : Titik.java
 *  Deskripsi   : berisi atribut dan method dalam class Titik
 *  Pembuat     : naufal akbar nugroho
 *  Tanggal     : 19/02/2026
 */

public class MTitik {
    public static void main(String[] args) {

        Titik T1 = new Titik();   //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);   //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik();  //mencetak koordinat T1 ke layar
        T1.geser(3,4);    //menggeser T1 sejauh (3,4)
        T1.printTitik();  //menampilkan koordinat T1 setelah digeser
        
        
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
        
        Titik T3 = new Titik(3,5);
        T3.printTitik();

        Titik T4 = new Titik();
        T4.setAbsis(9);
        T4.setOrdinat(2);
        T4.printTitik();

        Titik.getCounterTitik();
        System.out.println("Jumlah counter =" + Titik.getCounterTitik());
        
        System.out.println("Kuadran T2 = " + T2.getKuadran());

        System.out.println("Jarak T2 ke pusat = " + T2.getJarakPusat());

        System.out.println("Jarak T1 ke T2 = " + T1.getJarak(T2));
        
        T4.RefleksiX();
        T4.printTitik();

        T4.RefleksiY();
        T4.printTitik();

        Titik T5 = T2.getRefleksiX();
        T5.printTitik();
        
        Titik T6 = T2.getRefleksiY();
        T6.printTitik();
        

        
    }
}
