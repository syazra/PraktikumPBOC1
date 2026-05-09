/* Nama File  : Datum.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 30/04/2026 - 15.40 */

public class Datum<G> {
    /*************** ATRIBUT *******************/
    private G Isi;

    /*************** KONSTRUKTOR ***************/
    public Datum(G Isi) {
        this.Isi = Isi;
    }

    /*************** SELEKTOR ******************/
    public G getIsi() {
        return Isi;
    }

    /*************** MUTATOR *******************/
    public void setIsi(G IsiBaru) {
        this.Isi = IsiBaru;
    }
}