//Nama       : Naufal Akbar Nugroho
//NIM        : 24060124130057
//Tanggal    : 30/4/2026

public class Anabul {
    protected String nama ;

    public Anabul(){
        this.nama= "";
    }
    public Anabul(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public void Gerak(){
        System.out.println("Anabul" + nama + "bergerak ... ");
    }
    public void Bersuara(){
        System.out.println("Anabul" + nama + " bersuara... ");
    }
}

