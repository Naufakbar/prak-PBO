//Nama : Naufal Akbar Nugroho
//NIM : 24060124130057
//Deskripsi : Realisasi dari kelas Teman
import java.util.ArrayList;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama ;
    //konstruktor
    public Teman (){
        Lnama = new ArrayList<>();
        nbelm=0;

    } 
    // a.
    public int getNbelm(){
        return nbelm;
    }
    // b.
    public String getNama(int indeks){
        return Lnama.get(indeks);
    }
    // c.
    public void Setnama(int indeks,String nama){
        Lnama.set(indeks, nama);
    }
    // d.
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }
    // e.
    public void delNama(String nama){
        Lnama.remove(nama);
        nbelm--;
    }
    // f.
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }
    // g.
    public void gantiNama(String nama, String NamaBaru){
        int indeks = Lnama.indexOf(nama);
        if (indeks != -1){
            Lnama.set(indeks, NamaBaru);
        }
    }
    // h.
    public int countNama(String nama){
        int count = 0;
        for (String n : Lnama){
            if (n.equals(nama)){
                count ++;
            }
        }
        return count;
    }
    // i.
    public void ShowNama(){
        for(String n : Lnama){
            System.out.println(n);
        }
    }
}
