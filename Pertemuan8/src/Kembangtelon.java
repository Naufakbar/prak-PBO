//Nama       : Naufal Akbar Nugroho
//NIM        : 24060124130057
//Tanggal    : 30/4/2026

public class Kembangtelon extends Kucing {
    private String jenisBulu;

    public Kembangtelon(String nama, int bobot, String jenisBulu) {
        super(nama, bobot);
        this.jenisBulu = jenisBulu;
    }

    public String getJenisBulu() {
        return jenisBulu;
    }

    public void setJenisBulu(String jenisBulu) {
        this.jenisBulu = jenisBulu;
    }

    @Override
    public void Gerak() {
        System.out.println("Gerak : Maju mundur cantik");
    }

    @Override
    public void Bersuara() {
        System.out.println("Suara : Meow manja....");
    }
}