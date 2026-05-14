//Nama       : Naufal Akbar Nugroho
//NIM        : 24060124130057
//Tanggal    : 14/5/2026
public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getPanggilan() + " bergerak dengan terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(getPanggilan() + " berbunyi cuit");
    }
}
