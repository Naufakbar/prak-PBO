//Nama       : Naufal Akbar Nugroho
//NIM        : 24060124130057
//Tanggal    : 30/4/2026
public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " berbunyi guk-guk");
    }
}
