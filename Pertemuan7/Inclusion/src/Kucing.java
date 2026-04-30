/* Nama File  : Kucing.java */
/* Deskripsi  : polimorfisme universal inclusion */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Kucing extends Anabul {
    /*************** KONSTRUKTOR ***************/
    public Kucing() {
    }

    public Kucing(String Nama) {
        super(Nama);
    }

    /*************** METHOD LAIN ***************/
    @Override
    public void Gerak() {
        System.out.println("melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("meong");
    }
}