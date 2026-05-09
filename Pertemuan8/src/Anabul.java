/* Nama File  : Anabul.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 30/04/2026 - 15.40 */

public class Anabul {
    /*************** ATRIBUT *******************/
    protected String Nama;

    /*************** KONSTRUKTOR ***************/
    public Anabul() {
    }

    public Anabul(String Nama) {
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
    public void Gerak() {
        System.out.println("Anabul bergerak");
    }

    public void Bersuara() {
        System.out.println("Anabul bersuara");
    }
}