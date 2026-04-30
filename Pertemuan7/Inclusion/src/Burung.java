/* Nama File  : Burung.java */
/* Deskripsi  : polimorfisme universal inclusion */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Burung extends Anabul {
    /*************** KONSTRUKTOR ***************/
    public Burung() {
    }

    public Burung(String Nama) {
        super(Nama);
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
