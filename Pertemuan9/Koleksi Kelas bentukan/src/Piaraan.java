//Nama       : Naufal Akbar Nugroho
//NIM        : 24060124130057
//Tanggal    : 14/5/2026
import java.util.LinkedList;

public class Piaraan {
    private int nbelm;
    private final LinkedList<Anabul> lanabul;
    
    public Piaraan(){
        lanabul = new LinkedList<>();
        nbelm = 0 ;
    }
    // i
    public int getNbelm(){
        return nbelm;
    }
    // ii
    public void enqueueAnabul(Anabul anabul){
        lanabul.addLast(anabul);
        nbelm++;
    }
    // iii
    public boolean isMember(Anabul anabul){
        return lanabul.contains(anabul);
    }
    // iv
    public Anabul getAnabul(){
        return lanabul.peekFirst();
    }
    // v
    public Anabul dequeueAnabul(){
        Anabul removed = lanabul.poll();
        if(removed != null){
            nbelm--;
        }
        return removed;
    }
    // D
    public void showAnabul() {
        for (Anabul a : lanabul) {
            System.out.println(a.getPanggilan());
        }
    }

    // D
    public int countKucing() {
        int count = 0;

        for (Anabul a : lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }

        return count;
    }

    // E
    public double bobotKucing() {
        double total = 0;

        for (Anabul a : lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing)a).getBobot();
            }
        }
        return total;
    }

    // F
    public void showJenisAnabul() {
        for (Anabul a : lanabul) { 
            System.out.println(
                a.getPanggilan() + " - " +
                a.getClass().getName()
            );
        }
    }


}
