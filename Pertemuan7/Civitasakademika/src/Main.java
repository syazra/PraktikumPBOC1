/* Nama File  : Main.java */
/* Deskripsi  : main program */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Main {
    public static void main(String[] args) {
        Dosen D1 = new Dosen("1122334455", "Jake");
        Dosen D2 = new Dosen("1122334455", "Lea");
        Mahasiswa M1 = new Mahasiswa("Eric", "24060124130001", D1);
        Mahasiswa M2 = new Mahasiswa("Kevin", "24060124130002", D1);
        Mahasiswa M3 = new Mahasiswa("Jacob", "24060124130003", D1);
        Mahasiswa M4 = new Mahasiswa("New", "24060124130004", D2);
        Mahasiswa M5 = new Mahasiswa("Sunwoo", "24060124130005", D2);

        Seminar S = new Seminar();
        S.registrasi(D1);
        S.registrasi(D2);
        S.registrasi(M1);
        S.registrasi(M2);
        S.registrasi(M3);
        S.registrasi(M4);
        S.registrasi(M5);

        System.out.println("Jumlah peserta seminar: " + S.countPeserta());
        System.out.println();
        S.tampilPeserta();

        System.out.println("\nJumlah peserta mahasiswa: " + S.countMahasiswa());
        M1.setWali(D2);
        M1.tampilDataMahasiswa();
        M2.tampilDataMahasiswa();
        M3.tampilDataMahasiswa();
        M4.tampilDataMahasiswa();
        M5.tampilDataMahasiswa();
    }
}
