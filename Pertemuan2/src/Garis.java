/* Nama File  : Garis.java */
/* Deskripsi  : berisi atribut dan method dalam class Garis */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/02/2026 - 15.40 */

public class Garis {
    /*************** ATRIBUT *******************/
    private Titik TitikAwal;
    private Titik TitikAkhir;
    private static int counterGaris = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat garis (0, 0), (1, 1)
    public Garis() {
        TitikAwal = new Titik();
        TitikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // konstruktor untuk membuat garis dengan koordinat titik awal dan akhir tertentu
    public Garis(Titik awal, Titik akhir) {
        TitikAwal = awal;
        TitikAkhir = akhir;
        counterGaris++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan koordinat titik awal
    public Titik getTitikAwal() {
        return TitikAwal;
    }

    // mengembalikan koordinat titik akhir
    public Titik getTitikAkhir() {
        return TitikAkhir;
    }

    // mengembalikan nilai counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    /*************** MUTATOR *******************/
    // mengeset titik awal dengan koordinat baru T1
    public void setTitikAwal(Titik T1) {
        TitikAwal = T1;
    }

    // mengeset titik akhir dengan koordinat baru T2
    public void setTitikAkhir(Titik T2) {
        TitikAkhir = T2;
    }

    /*************** METHOD LAIN ***************/
    // menghitung panjang garis
    public double getPanjangGaris() {
        return Math.sqrt(Math.pow(getTitikAkhir().getAbsis() - getTitikAwal().getAbsis(), 2)
        + Math.pow(getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat(), 2));
    }

    // menghitung gradien garis
    public double getGradien() {
        return (getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat()) /
        (getTitikAkhir().getAbsis() - getTitikAwal().getAbsis());
    }

    // mengembalikan titik tengah garis
    public Titik getTitikTengah() {
        Titik T = new Titik();
        T.setAbsis((getTitikAwal().getAbsis() + getTitikAkhir().getAbsis()) / 2);
        T.setOrdinat((getTitikAwal().getOrdinat() + getTitikAkhir().getOrdinat()) / 2);
        return T;
    }

    // mengecek apakah dua garis sejajar
    public boolean isSejajar(Garis G) {
        return getGradien() == G.getGradien();
    }

    // mengecek apakah dua garis tegak lurus
    public boolean isTegakLurus(Garis G) {
        return getGradien() * G.getGradien() == -1;
    }

    // mencetak titk awal dan akhir garis ke layar
    public void printGaris() {
        System.out.println("Garis (" + TitikAwal.getAbsis() + ", " + TitikAwal.getOrdinat() + "), "
        + "(" + TitikAkhir.getAbsis() + ", " + TitikAkhir.getOrdinat() + ")");
    }

    // mencetak persamaan garis dalam bentuk y = mx + c
    public void printPersamaanGaris() {
        int m = (int) getGradien();
        int c = (int) (getTitikAwal().getOrdinat() - getGradien() * getTitikAwal().getAbsis());
        if (c > 0) {
            System.out.println("y = " + m + "x + " + c);
        } else if (c < 0) {
            System.out.println("y = " + m + "x - " + Math.abs(c));
        } else {
            System.out.println("y = " + m + "x");
        }
    }
}