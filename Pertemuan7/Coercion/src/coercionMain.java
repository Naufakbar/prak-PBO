//Nama : Naufal Akbar Nugroho
//NIM : 24060124130057
//Deskripsi : konversi tipe data dan parsing

public class coercionMain {
    public static void main(String[] args) throws Exception {
        // a. Contoh konversi integer ke berbagai format
        int nilai = 65;

        // ke integer
        System.out.println("Integer: " + nilai); //65

        // ke karakter
        char karakter = (char) nilai;
        System.out.println("Karakter: " + karakter); // A

        // ke real (double)
        double real = (double) nilai;
        System.out.println("Real: " + real); // 65.0

        // b. 
        int kembaliKeInt = (int) real;
        System.out.println("Kembali ke Integer: " + kembaliKeInt); // 65
        
        // c. 
        String X = "1234";
        String Y = "5678";

        // konkat string
        String S = X + Y;
        System.out.println("Konkatenasi S: " + S); //12345678

        // penjumlahan 
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Penjumlahan Z: " + Z); // 6912

        // d. 
        String P = "12.34";
        String Q = "56.78";

        // konkat
        String R = P + Q;
        System.out.println("Konkatenasi R: " + R); //12.3456.78

        // penjumlahan double
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Penjumlahan D: " + D); //69.12

        // e. 
        int A = Integer.parseInt(S);
        System.out.println("Nilai A: " + A); //12345678

        // f. 
        String T = Integer.toString(A);
        System.out.println("Nilai T: " + T); //12345678
    }
}
