//Nama : Naufal Akbar Nugroho
//NIM : 24060124130057
//Deskripsi : Aplikasi dari kelas Teman

public class Main {
    public static void main(String[] args) {

        // Membuat objek Teman
        Teman daftarTeman = new Teman();

        // Menambahkan nama teman
        daftarTeman.addNama("Andi");
        daftarTeman.addNama("Budi");
        daftarTeman.addNama("Citra");
        daftarTeman.addNama("Budi");

        // Menampilkan jumlah teman
        System.out.println("Jumlah teman : " + daftarTeman.getNbelm());

        // Menampilkan semua nama
        System.out.println("\nDaftar teman:");
        daftarTeman.ShowNama();

        // Mengambil nama berdasarkan indeks
        System.out.println("\nNama pada indeks 1 : " + daftarTeman.getNama(1));

        // Mengubah nama berdasarkan indeks
        daftarTeman.Setnama(2, "Dina");

        System.out.println("\nSetelah Setnama indeks 2 menjadi Dina:");
        daftarTeman.ShowNama();

        // Mengecek apakah nama ada di list
        System.out.println("\nApakah Budi member?");
        System.out.println(daftarTeman.isMember("Budi"));

        System.out.println("\nApakah Eko member?");
        System.out.println(daftarTeman.isMember("Eko"));

        // Mengganti nama tertentu
        daftarTeman.gantiNama("Andi", "Fajar");

        System.out.println("\nSetelah Andi diganti menjadi Fajar:");
        daftarTeman.ShowNama();

        // Menghitung jumlah nama tertentu
        System.out.println("\nJumlah nama Budi : "
                + daftarTeman.countNama("Budi"));

        // Menghapus nama
        daftarTeman.delNama("Budi");

        System.out.println("\nSetelah menghapus satu Budi:");
        daftarTeman.ShowNama();

        // Menampilkan jumlah akhir
        System.out.println("\nJumlah teman sekarang : " + daftarTeman.getNbelm());
    }
}