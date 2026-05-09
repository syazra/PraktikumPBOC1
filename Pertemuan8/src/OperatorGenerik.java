/* Nama File  : OperatorGenerik.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 30/04/2026 - 15.40 */

public class OperatorGenerik {
    public static <G> void Tukar(Datum<G> a, Datum<G> b) {
        G temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <G extends Kucing> double Bobot2(G a, G b) {
        return a.getBobot() + b.getBobot();
    }
}