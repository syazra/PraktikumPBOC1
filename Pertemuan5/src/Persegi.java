/* Nama File  : Persegi.java */
/* Deskripsi  : berisi atribut dan method dalam class Persegi */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/03/2026 - 15.40 */

public class Persegi extends BangunDatar implements IResize {
    /*************** ATRIBUT *******************/
    private double sisi;
    private static int counterPersegi = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek persegi tanpa parameter
    public Persegi() {
        jmlSisi = 4;
        counterPersegi++;
    }

    // konstruktor untuk membuat objek persegi dengan parameter 
    public Persegi(double sisi, String warna, String border) {
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
        counterPersegi++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan panjang sisi persegi
    public double getSisi() {
        return sisi;
    }

    // mengembalikan counter persegi
    public static int getCounterPersegi() {
        return counterPersegi;
    }

    /*************** MUTATOR *******************/
    // mengeset panjang sisi persegi dengan nilai baru
    public void setSisi(double sisi) {
        this.sisi = sisi;
    } 

    /*************** METHOD LAIN ***************/
    // mengembalikan diagonal persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // menghitung keliling persegi
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }
    
    // menghitung luas persegi
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    // menambah panjang sisi menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        sisi = sisi + sisi * 0.1;
    }

    // mengurangi panjang sisi menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    // menskalakan panjang sisi sesuai dengan input percent yang diberikan
    @Override
    public void zoom(double percent) {
        sisi = sisi * (percent / 100);
    }

    // mencetak info persegi ke layar
    @Override
    public final void printInfo() {
        super.printInfo();
        System.out.println("Panjang Sisi Persegi: " + sisi);
    }
}