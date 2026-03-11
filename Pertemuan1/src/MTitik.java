/* Nama File  : MTitik.java */
/* Deskripsi  : berisi main program class Titik */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 19/02/2026 - 15.40 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // membuat objek titik T1 (0, 0)
        Titik T2 = new Titik(); // membuat objek titik T2 (0, 0)

        T1.setAbsis(3); // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // mencetak koordinat T1 ke layar
        T1.geser(3, 4); // menggeser T1 sejauh (3, 4)
        T1.printTitik(); // mencetak koordinat T1 setelah digeser

        T2.setAbsis(9); // mengubah absis T2 dengan nilai 9
        T2.setOrdinat(-1); // mengubah ordinat T2 dengan nilai -1
        T2.printTitik(); // mencetak koordinat T2 ke layar
        T2.geser(-11, 6); // menggeser T2 sejauh (-11, 6)
        System.out.println("Absis T2: " + T2.getAbsis()); // mencetak absis T2 setelah digeser
        System.out.println("Ordinat T2: " + T2.getOrdinat()); // mencetak absis T2 setelah digeser
    }
}