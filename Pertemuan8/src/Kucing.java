/* Nama File  : Kucing.java */
/* Deskripsi  : polimorfisme universal inclusion */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Kucing extends Anabul {
    /*************** ATRIBUT *******************/
    protected double Bobot;

    /*************** KONSTRUKTOR ***************/
    public Kucing() {
    }

    public Kucing(String Nama, double Bobot) {
        super(Nama);
        this.Bobot = Bobot;
    }

    /*************** SELEKTOR ******************/
    public double getBobot() {
        return Bobot;
    }

    /*************** MUTATOR *******************/
    public void setBobot(double Bobot) {
        this.Bobot = Bobot;
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