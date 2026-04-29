//Nama : Naufal Akbar Nugroho
//NIM : 24060124130057
//Deskripsi :  aplikasi dari kelas kelas yang sudah dibuat

public class Main {
     public static void main(String[] args) {

        // e.  dosen dan mahasiswa
        Dosen d1 = new Dosen("Anis", "D001");
        Dosen d2 = new Dosen("Ray", "D002");
        Mahasiswa m1 = new Mahasiswa("Andika", "123", d1);
        Mahasiswa m2 = new Mahasiswa("Badri", "234", d1);
        Mahasiswa m3 = new Mahasiswa("Cece", "345", d2);
        Mahasiswa m4 = new Mahasiswa("Dena", "456", d2);
        Mahasiswa m5 = new Mahasiswa("Estra", "567", d1);

        // b. seminar
        Seminar s = new Seminar();

        // f. registrasi
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // c. jumlah peserta
        System.out.println("Total Peserta: " + s.countPeserta());

        // g. tampil peserta
        System.out.println("\nDaftar Peserta:");
        s.tampilPeserta();

        // h. jumlah mahasiswa
        System.out.println("\nJumlah Mahasiswa: " + s.countMahasiswa());

        // i. ubah wali
        m1.setWali(d2);

        // j. tampil data mahasiswa
        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
    }
}
