/* Nama File  : MTitik.java */
/* Deskripsi  : berisi atribut dan method dalam class Titik */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 19/02/2026 - 15.40 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
    }
}