/* Nama File  : Anabul.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Anabul {
    /*************** ATRIBUT *******************/
    protected String Nama;
    protected String Panggilan;

    /*************** KONSTRUKTOR ***************/
    public Anabul() {
    }

    public Anabul(String Nama, String Panggilan) {
        this.Nama = Nama;
        this.Panggilan = Panggilan;
    }

    /*************** SELEKTOR ******************/
    public String getNama() {
        return Nama;
    }

    public String getPanggilan() {
        return Panggilan;
    }

    /*************** MUTATOR *******************/
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setPanggilan(String Panggilan) {
        this.Panggilan = Panggilan;
    }

    /*************** METHOD LAIN ***************/
    public void Gerak() {
        System.out.println("Anabul bergerak");
    }

    public void Bersuara() {
        System.out.println("Anabul bersuara");
    }
}