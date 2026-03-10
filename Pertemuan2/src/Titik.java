/*  Nama File   : Titik.java
 *  Deskripsi   : berisi atribut dan method dalam class Titik
 *  Pembuat     : naufal akbar nugroho
 *  Tanggal     : 19/02/2026
 */


public class Titik {

    /***************ATRIBUT****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;
    /***************METHOD****************/
    //konstruktor untuk membuat titik (0,0)
    Titik (double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik ++;
    }
    Titik(){
        this(0,0);
    }


    static int getCounterTitik(){
        return counterTitik;
    }


    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    int getKuadran (){
        if (absis > 0 && ordinat > 0){
            return 1;
        }
        else if (absis < 0 && ordinat > 0 ){
            return 2;
        }
        else if (absis < 0 && ordinat < 0){
            return 3;
        }
        else {
            return 4;
        }
    }

    double getJarakPusat(){
        double jarak = Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
        return jarak;
    }

    double getJarak   (Titik T){
        double jarak = Math.sqrt(Math.pow(absis - T.absis, 2) + Math.pow(ordinat - T.ordinat, 2));
        return jarak;
    }

    void RefleksiX(){
        ordinat = -ordinat;
    }

    void RefleksiY(){
        absis = -absis;
    }

    Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }   
    
    Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }    

    


} //end class Titik

