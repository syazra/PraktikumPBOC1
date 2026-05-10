/* Nama File  : Kucing.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Kucing extends Anabul {
    /*************** ATRIBUT *******************/
    private double Bobot;

    /*************** KONSTRUKTOR ***************/
    public Kucing() {
    }

    public Kucing(String Nama, String Panggilan, double Bobot) {
        super(Nama, Panggilan);
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