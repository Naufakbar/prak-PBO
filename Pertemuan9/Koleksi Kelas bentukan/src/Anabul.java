//Nama       : Naufal Akbar Nugroho
//NIM        : 24060124130057
//Tanggal    : 14/5/2026

public class Anabul {
    private String panggilan;
    
    public Anabul(){
        this("");
    }
    public Anabul(String nama){
        this.panggilan = nama;
     
    }

    /*Setter */
    public void setNama(String nama) {
         this.panggilan = nama;
    }

    /*Getter */
    public String getPanggilan() {
        return this.panggilan;
    }

    public void Gerak() {
           System.out.println("Anabul " + panggilan + "bergerak" );
        }
        
        public void Bersuara() {
        System.out.println("Anabul " + panggilan + "bersuara" );

    }
}

