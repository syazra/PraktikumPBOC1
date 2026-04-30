/* Nama File  : Civitasakademika.java */
/* Deskripsi  : class Civitasakademika */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Civitasakademika {
    /*************** ATRIBUT *******************/
    protected String Nama;

    /*************** KONSTRUKTOR ***************/
    public Civitasakademika() {
    }

    public Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    /*************** SELEKTOR ******************/
    public String getNama() {
        return Nama;
    }
    
    /*************** MUTATOR *******************/
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /*************** METHOD LAIN ***************/
    public String getNomor() {
        return "-";
    }
}
