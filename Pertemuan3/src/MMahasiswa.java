/* Nama File  : MMahasiswa.java */
/* Deskripsi  : berisi main program class Mahasiswa */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 05/03/2026 - 15.40 */

public class MMahasiswa {
    public static void main(String[] args) {
        Dosen D1 = new Dosen(); // membuat objek dosen tanpa parameter
        Dosen D2 = new Dosen("002", "Murphy", "Informatika"); // membuat objek dosen dengan parameter
        MataKuliah MK1 = new MataKuliah(); // membuat objek matakuliah tanpa parameter
        MataKuliah MK2 = new MataKuliah("MBD", "Manajemen Basis Data", 3); // membuat objek matakuliah dengan parameter
        MataKuliah MK3 = new MataKuliah("GTI", "Grafik dan Teknik Interaktif", 3); // membuat objek matakuliah dengan parameter
        MataKuliah MK4 = new MataKuliah("ASA", "Analisis dan Strategi ALgoritma", 3); // membuat objek matakuliah dengan parameter
        Kendaraan K1 = new Kendaraan(); // membuat objek kendaraan tanpa parameter
        Kendaraan K2 = new Kendaraan("DEF 2222 BB", "motor"); // membuat objek kendaraan dengan parameter
        Mahasiswa M1 = new Mahasiswa(); // membuat objek mahasiswa tanpa parameter
        Mahasiswa M2 = new Mahasiswa("202", "Lea", "Informatika"); // membuat objek mahasiswa dengan parameter

        D1.setNIP("001"); // mengubah nip dosen D1 dengan nilai baru
        D1.setNama("Brownie"); // mengubah nama dosen D1 dengan nilai baru
        D1.setProdi("Informatika"); // mengubah prodi dosen D1 dengan nilai baru
        D1.printDosen(); // mencetak dosen D1 setelah diubah

        System.out.println("NIP: " + D2.getNIP()); // mencetak nip dosen D2
        System.out.println("Nama: " + D2.getNama()); // mencetak nama dosen D2
        System.out.println("Prodi: " + D2.getProdi()); // mencetak prodi dosen D2

        MK1.setIdMatKul("PBO"); // mengubah idMatKul MK1 dengan nilai baru
        MK1.setNama("Pemrograman Berorientasi Objek"); // mengubah nama matakuliah MK1 dengan nilai baru
        MK1.setSKS(3); // mengubah sks matakuliah MK1 dengan nilai baru
        MK1.printMataKuliah(); // mencetak matakuliah MK1 setelah diubah

        System.out.println("IdMatKul: " + MK2.getIdMatKul()); // mencetak idMatKul matakuliah MK2
        System.out.println("Nama: " + MK2.getNama()); // mencetak nama matakuliah MK2
        System.out.println("Jumlah SKS: " + MK2.getSKS()); // mencetak sks matakuliah MK2

        K1.setNoPlat("ABC 1111 AA"); // mengubah noPlat kendaraan K1 dengan nilai baru
        K1.setJenis("mobil"); // mengubah jenis kendaraan K1 dengan nilai baru
        K1.printKendaraan(); // mencetak kendaraan K1 setelah diubah
        
        System.out.println("NoPlat: " + K2.getNoPlat()); // mencetak noPlat kendaraan K2
        System.out.println("Jenis: " + K2.getJenis()); // mencetak jenis kendaraan K2

        M1.setNIM("201"); // mengubah nim mahasiswa M1 dengan nilai baru
        M1.setNama("Jake"); // mengubah nama mahasiswa M1 dengan nilai baru
        M1.setProdi("Informatika"); // mengubah prodi mahasiswa M1 dengan nilai baru
        M1.printMhs(); // mencetak mahasiswa M1 setelah diubah
        M1.addMatKul(MK1); // menambahkan matakuliah MK1 ke atribut listMatKul mahasiswa M1
        M1.addMatKul(MK2); // menambahkan matakuliah MK2 ke atribut listMatKul mahasiswa M1
        M1.addMatKul(MK3); // menambahkan matakuliah MK3 ke atribut listMatKul mahasiswa M1
        M1.addMatKul(MK4); // menambahkan matakuliah MK4 ke atribut listMatKul mahasiswa M1
        M1.setDosenWali(D1); // mengubah dosenWali mahasiswa M1 dengan nilai baru
        M1.setKendaraan(K1); // mengubah kendaraan mahasiswa M1 dengan nilai baru
        M1.printDetailMhs(); // mencetak detail mahasiswa M1
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatKul()); // mencetak jumlah matakuliah yang diambil mahasiswa M1
        System.out.println("Jumlah SKS Mata Kuliah: " + M1.getJumlahSKS()); // mencetak jumlah sks matakuliah yang diambil mahasiswa M1

        M2.addMatKul(MK2); // menambahkan matakuliah MK1 ke atribut listMatKul mahasiswa M2
        M2.addMatKul(MK3); // menambahkan matakuliah MK1 ke atribut listMatKul mahasiswa M2
        M2.setDosenWali(D2); // mengubah dosenWali mahasiswa M2 dengan nilai baru
        M2.setKendaraan(K2); // mengubah kendaraan mahasiswa M2 dengan nilai baru
        System.out.println("NIM: " + M2.getNIM()); // mencetak nim mahasiswa M2
        System.out.println("Nama: " + M2.getNama()); // mencetak nama mahasiswa M2
        System.out.println("Prodi: " + M2.getProdi()); // mencetak prodi mahasiswa M2
        System.out.println("Daftar Mata Kuliah: ");
        for (int i = 0; i < M2.getListMatKul().size(); i++) {
            System.out.println(M2.getListMatKul().get(i).getIdMatKul() + " "); // mencetak daftar matakuliah yang diambil mahasiswa M2
        }
        System.out.println("NIP: " + M2.getDosenWali().getNIP()); // mencetak nip dosenWali mahasiswa M2
        System.out.println("Nama: " + M2.getDosenWali().getNama()); // mencetak nama dosenWali mahasiswa M2
        System.out.println("Prodi: " + M2.getDosenWali().getProdi()); // mencetak prodi dosenWali mahasiswa M2
        System.out.println("NoPlat: " + M2.getKendaraan().getNoPlat()); // mencetak noPlat kendaraan mahasiswa M2
        System.out.println("Jenis: " + M2.getKendaraan().getJenis()); // mencetak jenis kendaraan mahasiswa M2
        System.out.println("Jumlah Mata Kuliah: " + M2.getJumlahMatKul()); // mencetak jumlah matakuliah yang diambil mahasiswa M2
        System.out.println("Jumlah SKS Mata Kuliah: " + M2.getJumlahSKS()); // mencetak jumlah sks matakuliah yang diambil mahasiswa M1
    }
}