/* Nama File  : MGenerikLarik.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 30/04/2026 - 15.40 */

public class MGenerikLarik {
    public static void main(String[] args) {
        Data<Anabul> dataAnabul = new Data<>();

        // procedure setIsi
        dataAnabul.setIsi(1, new Anggora("Ocil", 3.2));
        dataAnabul.setIsi(2, new KembangTelon("Melky", 4.1));
        dataAnabul.setIsi(3, new Anggora("Cecep", 3.9));
        System.out.println("=== Setelah setIsi ===");
        System.out.println("Data berhasil diisi ke posisi 1, 2, dan 3");

        // function getIsi
        System.out.println("\n=== Aplikasi getIsi ===");
        Anabul a1 = dataAnabul.getIsi(1);
        Anabul a2 = dataAnabul.getIsi(2);
        Anabul a3 = dataAnabul.getIsi(3);
        System.out.println("Data ke-1 : " + a1.getNama());
        a1.Bersuara();
        System.out.println("Data ke-2 : " + a2.getNama());
        a2.Bersuara();
        System.out.println("Data ke-3 : " + a3.getNama());
        a3.Bersuara();

        // function getSize
        System.out.println("\n=== Aplikasi getSize ===");
        System.out.println("Jumlah elemen = " + dataAnabul.getSize());
        dataAnabul.setIsi(4, new KembangTelon("Oyen", 4.5));
        System.out.println("Setelah tambah 1 elemen, size = " + dataAnabul.getSize());
    }
}