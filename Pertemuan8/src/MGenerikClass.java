/* Nama File  : MGenerikClass.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 30/04/2026 - 15.40 */

public class MGenerikClass {
    public static void main(String[] args) {
        Anggora Anggora = new Anggora("Cio", 3.2);
        KembangTelon KembangTelon = new KembangTelon("Oki", 4.1);

        // membungkus objek dengan kelas generik Datum
        Datum<Anabul> Datum1 = new Datum<>(Anggora);
        Datum<Anabul> Datum2 = new Datum<>(KembangTelon);

        // menampilkan isi Datum1
        System.out.println("=== Datum 1 ===");
        System.out.println("Nama : " + Datum1.getIsi().getNama());
        Datum1.getIsi().Bersuara();
        Datum1.getIsi().Gerak();

        // menampilkan isi Datum2
        System.out.println("\n=== Datum 2 ===");
        System.out.println("Nama : " + Datum2.getIsi().getNama());
        Datum2.getIsi().Bersuara();
        Datum2.getIsi().Gerak();

        // mengubah isi Datum1
        Datum1.setIsi(new KembangTelon("Yeyen", 4.5));
        System.out.println("\n=== Datum 1 setelah diubah ===");
        System.out.println("Nama : " + Datum1.getIsi().getNama());
        Datum1.getIsi().Bersuara();
        Datum1.getIsi().Gerak();
    }
}