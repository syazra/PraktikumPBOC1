/* Nama File  : Persegi.java */
/* Deskripsi  : berisi atribut dan method dalam class Persegi */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 12/03/2026 - 15.40 */

public class Persegi extends BangunDatar {
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

    /*************** MUTATOR *******************/
    // mengeset panjang sisi persegi dengan nilai baru
    public void setSisi(double sisi) {
        this.sisi = sisi;
    } 

    /*************** METHOD LAIN ***************/
    // menghitung keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }
    
    // menghitung luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // mengembalikan diagonal persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // mencetak counter persegi ke layar
    public static void printCounterPersegi() {
        System.out.println("Jumlah Objek Persegi: " + counterPersegi);
    }

    // mencetak info persegi ke layar
    @Override
    public final void printInfo() {
        super.printInfo();
        System.out.println("Panjang Sisi Persegi: " + sisi);
    }
}