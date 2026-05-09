/* Nama File  : MGenerikOperator.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 30/04/2026 - 15.40 */

public class MGenerikOperator {
    public static void main(String[] args) {

        // procedure Tukar Integer
        Datum<Integer> a = new Datum<>(3);
        Datum<Integer> b = new Datum<>(6);
        System.out.println("=== Tukar Integer ===");
        System.out.println("Sebelum : a = " + a.getIsi() + ", b = " + b.getIsi());
        OperatorGenerik.Tukar(a, b);
        System.out.println("Sesudah : a = " + a.getIsi() + ", b = " + b.getIsi());

        // procedure Tukar String
        Datum<String> c = new Datum<>("Informatika");
        Datum<String> d = new Datum<>("Undip");
        System.out.println("\n=== Tukar String ===");
        System.out.println("Sebelum: c = " + c.getIsi() + ", d = " + d.getIsi());
        OperatorGenerik.Tukar(c, d);
        System.out.println("Sesudah: c = " + c.getIsi() + ", d = " + d.getIsi());

        // procedure Tukar Keluarga Anabul
        Datum<Anabul> e = new Datum<>(new Anggora("Cio", 3.2));
        Datum<Anabul> f = new Datum<>(new KembangTelon("Omay", 4.1));
        System.out.println("\n=== Tukar Anabul ===");
        System.out.println("Sebelum:");
        System.out.println("e = " + e.getIsi().getNama());
        System.out.println("f = " + f.getIsi().getNama());
        OperatorGenerik.Tukar(e, f);
        System.out.println("Sesudah:");
        System.out.println("e = " + e.getIsi().getNama());
        System.out.println("f = " + f.getIsi().getNama());

        // fungsi generik Bobot2
        Anggora g = new Anggora("Tomy", 3.5);
        KembangTelon h = new KembangTelon("Pepeng", 4.0);
        double totalBobot = OperatorGenerik.Bobot2(g, h);
        System.out.println("\n=== Bobot2 ===");
        System.out.println("Bobot " + g.getNama() + " = " + g.getBobot() + " kg");
        System.out.println("Bobot " + h.getNama() + " = " + h.getBobot() + " kg");
        System.out.println("Total bobot = " + totalBobot + " kg");
    }
}