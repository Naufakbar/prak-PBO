//Nama       : Naufal Akbar Nugroho
//NIM        : 24060124130057
//Tanggal    : 14/5/2026
public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getPanggilan() + " bergerak dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getPanggilan() + " berbunyi guk-guk");
    }
}
