/* Nama File  : Lingkaran.java */
/* Deskripsi  : berisi atribut dan method dalam class Lingkaran */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/03/2026 - 15.40 */

public class Lingkaran extends BangunDatar implements IResize {
    /*************** ATRIBUT *******************/
    private double jari;
    private static int counterLingkaran = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek lingkaran tanpa parameter
    public Lingkaran() {
        jmlSisi = 1;
        counterLingkaran++;
    }

    // konstruktor untuk membuat objek lingkaran dengan parameter 
    public Lingkaran(double jari, String warna, String border) {
        super(1, warna, border);
        this.jari = jari;
        counterLingkaran++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan jari-jari lingkaran
    public double getJari() {
        return jari;
    }

    // mengembalikan counter lingkaran
    public static int getCounterLingkaran() {
        return counterLingkaran;
    }

    /*************** MUTATOR *******************/
    // mengeset jari-jari lingkaran dengan nilai baru
    public void setJari(double jari) {
        this.jari = jari;
    } 

    /*************** METHOD LAIN ***************/
    // mengembalikan diameter lingkaran
    public double getDiameter() {
        return 2 * jari;
    }

    // menghitung keliling lingkaran
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }
    
    // menghitung luas lingkaran
    @Override
    public double getLuas() {
        return Math.pow(Math.PI, 2) * jari;
    }

    // menambah panjang jari-jari menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        jari = jari + jari * 0.1;
    }

    // mengurangi panjang jari-jari menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    // menskalakan panjang jari-jari sesuai dengan input percent yang diberikan
    @Override
    public void zoom(double percent) {
        jari = jari * (percent / 100);
    }

    // mencetak info lingkaran ke layar
    @Override
    public final void printInfo() {
        super.printInfo();
        System.out.println("Jari-Jari Lingkaran: " + jari);
        System.out.println("Diameter Lingkaran: " + getDiameter());
    }
}