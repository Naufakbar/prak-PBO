public class Dosen {
    /************** ATRIBUT **************/
    private String Nip;
    private String Nama;
    private String Prodi;
    
    /************** METHOD **************/
    // Konstruktor tanpa parameter
    Dosen(){
        this.Nama = "";
        this.Nip = "";
        this.Prodi = "";
    }
    // Konstruktor dengan parameter
    public Dosen(String Nip, String Nama, String Prodi) {
        this.Nama = Nama;
        this.Nip = Nip;
        this.Prodi = Prodi;
    }

    // Selektor (getter)
    String GetNamaDosen(){
        return Nama;
    }

    String GetNipDosen(){
        return Nip;
    }
    
    String GetProdiDosen(){
        return Prodi;
    }

    // Mutator (setter)
    public void SetNipDosen(String nip){
        this.Nip = nip;
    }

    public void SetNamaDosen(String nama){
        this.Nama = nama;
    }
    public void SetProdiDosen(String Prodi){
        this.Prodi = Prodi;
    }

    
}
