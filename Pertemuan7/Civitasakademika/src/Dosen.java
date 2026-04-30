/* Nama File  : Dosen.java */
/* Deskripsi  : class Dosen */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Dosen extends Civitasakademika {
    /*************** ATRIBUT *******************/
    private String NIP;

    /*************** KONSTRUKTOR ***************/
    public Dosen() {
    }

    public Dosen(String NIP, String Nama) {
        super(Nama);
        this.NIP = NIP;
    }

    /*************** SELEKTOR ******************/
    @Override
    public String getNomor() {
        return NIP;
    }
}
