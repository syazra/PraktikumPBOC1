/* Nama File  : Titik.java */
/* Deskripsi  : berisi atribut dan method dalam class Titik */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 19/02/2026 - 15.40 */

public class Titik {
    /*************** ATRIBUT *******************/
    private double absis;
    private double ordinat;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat titik (0, 0)
    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    /*************** MUTATOR *******************/
    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    /*************** METHOD LAIN ***************/
    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}
