/* Nama File  : Titik.java */
/* Deskripsi  : berisi atribut dan method dalam class Titik */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/02/2026 - 15.40 */

public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD****************/
    //konstruktor untuk membuat titik (0, 0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    
    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
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

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengembalikan kuadran dari titik
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    //menghitung jarak titik ke pusat (0, 0)
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //menghitung jarak titik ke titik lain
    double getJarak(Titik T) {
        return Math.sqrt(Math.pow((absis - T.getAbsis()), 2) + Math.pow((ordinat - T.getOrdinat()), 2));
    }

    //merefleksikan titik terhadap sumbu X
    void refleksiX() {
        ordinat = ordinat * (-1);
    }

    //merefleksikan titik terhadap sumbu Y
    void refleksiY() {
        absis = absis * (-1);
    }

    //menghasilkan titik baru yang merupakan refleksi terhadap sumbu X
    Titik getRefleksiX() {
        Titik T2 = new Titik();
        T2.setAbsis(absis);
        T2.setOrdinat(ordinat * (-1));
        return T2;
    }

    //menghasilkan titik baru yang merupakan refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        Titik T2 = new Titik();
        T2.setAbsis(absis * (-1));
        T2.setOrdinat(ordinat);
        return T2;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}
