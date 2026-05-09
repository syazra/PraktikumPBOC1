/* Nama File  : Anjing.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Anjing extends Anabul {
    /*************** KONSTRUKTOR ***************/
    public Anjing() {
    }

    public Anjing(String Nama) {
        super(Nama);
    }

    /*************** METHOD LAIN ***************/
    @Override
    public void Gerak() {
        System.out.println("melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("guk-guk");
    }
}