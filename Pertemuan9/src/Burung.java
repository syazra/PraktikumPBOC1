/* Nama File  : Burung.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Burung extends Anabul {
    /*************** KONSTRUKTOR ***************/
    public Burung() {
    }

    public Burung(String Nama, String Panggilan) {
        super(Nama, Panggilan);
    }

    /*************** METHOD LAIN ***************/
    @Override
    public void Gerak() {
        System.out.println("terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println("cuit");
    }
}
