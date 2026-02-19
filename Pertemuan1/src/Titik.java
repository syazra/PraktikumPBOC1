/* Nama File  : Titik.java */
/* Deskripsi  : berisi atribut dan method dalam class Titik */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 19/02/2026 - 15.40 */

public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;

    /***************METHOD****************/
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset absis titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
