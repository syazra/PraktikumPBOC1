/* Nama File  : MAnabul.java */
/* Deskripsi  : polimorfisme universal inclusion */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class MAnabul {
    public static void main(String[] args) {
        Anabul Anabul1 = new Kucing();
        Anabul Anabul2 = new Anjing();
        Anabul Anabul3 = new Burung();

        System.out.println("=== Kucing ===");
        Anabul1.Gerak();
        Anabul1.Bersuara();

        System.out.println("\n=== Anjing ===");
        Anabul2.Gerak();
        Anabul2.Bersuara();

        System.out.println("\n=== Burung ===");
        Anabul3.Gerak();
        Anabul3.Bersuara();
    }
}