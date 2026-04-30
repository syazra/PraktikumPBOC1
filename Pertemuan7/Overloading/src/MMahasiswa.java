/* Nama File  : MMahasiswa.java */
/* Deskripsi  : polimorfisme ad hoc overloading */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class MMahasiswa {
    public static void main(String[] args) {
        // c. Konstruktor tanpa parameter
        Mahasiswa M1 = new Mahasiswa();
        System.out.println("Mahasiswa 1 (tanpa parameter)");
        M1.printInfo();

        // d. Konstruktor 3 parameter
        Mahasiswa M2 = new Mahasiswa("24060124130088", "Syafira Azka Ramadhani", "Informatika");
        System.out.println("\nMahasiswa 2 (dengan parameter)");
        M2.printInfo();

        // e. Konstruktor copy
        Mahasiswa M3 = new Mahasiswa(M2);
        System.out.println("\nMahasiswa 3 (copy dari Mahasiswa 2)");
        M3.printInfo();

        // b1. setProgramStudi tanpa parameter
        M1.setProgramStudi();
        System.out.println("\nsetProgramStudi tanpa parameter");
        M1.printInfo();

        // b2. setProgramStudi dengan satu parameter string
        M1.setProgramStudi("Statistika");
        System.out.println("\nsetProgramStudi dengan parameter");
        M1.printInfo();

        // b3.  setProgramStudi dengan objek Mahasiswa
        M1.setProgramStudi(M2);
        System.out.println("\nsetProgramStudi copy dari Mahasiswa 2");
        M1.printInfo();
    }
}