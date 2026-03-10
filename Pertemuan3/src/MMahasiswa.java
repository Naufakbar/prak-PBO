public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek mata kuliah 
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        
        // Membuat objek mahasiswa, dosen, dan kendaraan 
        Mahasiswa M1 = new Mahasiswa("001", "X", "IF");
        Dosen D1 = new Dosen("123", "Y", "IF");
        Kendaraan K1 = new Kendaraan("ABCD", "mobil");
        
        // Mengatur dosen wali dan kendaraan 
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        
        // Menambahkan mata kuliah 
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        
        // Menampilkan detail 
        M1.printDetailMhs();
        
        // Menampilkan jumlah mata kuliah dan total SKS yang diambil 
        System.out.println("Jumlah Matkul = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS = " + M1.getJumlahSKS());
    }
}